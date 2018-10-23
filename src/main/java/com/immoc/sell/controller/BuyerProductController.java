package com.immoc.sell.controller;

import com.immoc.sell.dataobject.ProductCategory;
import com.immoc.sell.dataobject.ProductInfo;
import com.immoc.sell.service.ProductCategoryService;
import com.immoc.sell.service.ProductInfoService;
import com.immoc.sell.utils.ResultVOUtil;
import com.immoc.sell.vo.ProductInfoVO;
import com.immoc.sell.vo.ProductVO;
import com.immoc.sell.vo.ResultVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Description: 买家商品控制类
 * Created by Liu qi.
 * Date: 2018-10-23 21:23
 */
@RestController
@RequestMapping("/buyer/product")
public class BuyerProductController {

    @Autowired
    private ProductInfoService productInfoService;

    @Autowired
    private ProductCategoryService productCategoryService;

    @GetMapping("/list")
    public ResultVO list() {
        // 查询所有上架的商品
        List<ProductInfo> upProductInfoList = productInfoService.findUpAll();

        // 一次性将上架商品的所属所有类目查询出来
        List<Integer> upCategoryTypeList = upProductInfoList.stream()
                .map(ProductInfo::getCategoryType).collect(Collectors.toList());
        List<ProductCategory> upProductCategoryList = productCategoryService.findByCategoryTypeIn(upCategoryTypeList);

        // 数据组装
        ProductVO productVO;
        ProductInfoVO productInfoVO;
        List<ProductInfoVO> productInfoVOList;
        List<ProductVO> productVOList = new ArrayList<>();
        for (ProductCategory upProductCategory : upProductCategoryList) {
            productVO = new ProductVO();
            productVO.setCategoryName(upProductCategory.getCategoryName());
            productVO.setCategoryType(upProductCategory.getCategoryType());

            productInfoVOList = new ArrayList<>();
            for (ProductInfo productInfo : upProductInfoList) {
                if (productInfo.getCategoryType().equals(upProductCategory.getCategoryType())) {
                    productInfoVO = new ProductInfoVO();
                    BeanUtils.copyProperties(productInfo, productInfoVO);
                    productInfoVOList.add(productInfoVO);
                }
            }
            productVO.setProductInfoVOList(productInfoVOList);
            productVOList.add(productVO);
        }

        return ResultVOUtil.success(productVOList);
    }

}

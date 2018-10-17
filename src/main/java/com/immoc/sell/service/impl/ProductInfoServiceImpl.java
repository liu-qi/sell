package com.immoc.sell.service.impl;

import com.immoc.sell.dataobject.ProductInfo;
import com.immoc.sell.enums.ProductStatusEnum;
import com.immoc.sell.repository.ProductInfoRepository;
import com.immoc.sell.service.ProductInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Description: 商品信息Service接口实现类
 * Created by Liu qi.
 * Date: 2018-10-17 22:09
 */
@Service
public class ProductInfoServiceImpl implements ProductInfoService {

    @Autowired
    private ProductInfoRepository productInfoRepository;

    public ProductInfo findById(String productId) {
        return productInfoRepository.findById(productId).orElse(null);
    }

    public List<ProductInfo> findUpAll() {
        return productInfoRepository.findByProductStatus(ProductStatusEnum.UP.getCode());
    }

    public Page<ProductInfo> findAll(Pageable pageable) {
        return productInfoRepository.findAll(pageable);
    }

    public ProductInfo save(ProductInfo productInfo) {
        return productInfoRepository.save(productInfo);
    }
}

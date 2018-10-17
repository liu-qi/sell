package com.immoc.sell.service;

import com.immoc.sell.dataobject.ProductInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Description: 商品信息Service接口
 * Created by Liu qi.
 * Date: 2018-10-17 21:49
 */
public interface ProductInfoService {

    /**
     * 根据商品ID获取商品信息
     *
     * @param productId 商品ID
     * @return 商品信息
     */
    ProductInfo findById(String productId);

    /**
     * 获取所有上架的商品集合
     *
     * @return 上架的商品集合
     */
    List<ProductInfo> findUpAll();

    /**
     * 分页获取商品信息列表
     *
     * @param pageable 分页对象
     * @return 商品信息分页列表
     */
    Page<ProductInfo> findAll(Pageable pageable);

    /**
     * 新增商品信息
     *
     * @param productInfo 商品信息
     * @return 商品信息
     */
    ProductInfo save(ProductInfo productInfo);

    // 加库存

    // 减库存

}

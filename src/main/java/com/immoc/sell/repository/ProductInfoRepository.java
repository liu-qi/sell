package com.immoc.sell.repository;

import com.immoc.sell.dataobject.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Description: 商品信息DAO接口
 * Created by Liu qi.
 * Date: 2018-10-16 22:31
 */
public interface ProductInfoRepository extends JpaRepository<ProductInfo, String> {

    /**
     * 根据商品状态获取商品列表
     *
     * @param productStatus 商品状态
     * @return 商品列表集合
     */
    List<ProductInfo> findByProductStatus(Integer productStatus);

}

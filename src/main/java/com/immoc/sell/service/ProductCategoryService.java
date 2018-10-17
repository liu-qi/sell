package com.immoc.sell.service;

import com.immoc.sell.dataobject.ProductCategory;

import java.util.List;

/**
 * Description: 商品类目Service接口
 * Created by Liu qi.
 * Date: 2018-10-16 21:53
 */
public interface ProductCategoryService {

    /**
     * 根据商品类目ID查询商品类目
     *
     * @param categoryId 商品类目ID
     * @return 商品类目
     */
    ProductCategory findById(Integer categoryId);

    /**
     * 查询所有商品类目集合
     *
     * @return 商品类目集合
     */
    List<ProductCategory> findAll();

    /**
     * 根据指定类目编号列表查询对应商品类目集合
     *
     * @param categoryTypeList 指定类目编号列表
     * @return 商品类目集合
     */
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    /**
     * 新增商品类目
     *
     * @param productCategory 商品类目
     * @return 商品类目
     */
    ProductCategory save(ProductCategory productCategory);

}

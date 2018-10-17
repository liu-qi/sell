package com.immoc.sell.service;

import com.immoc.sell.dataobject.ProductCategory;

import java.util.List;

/**
 * Description: 商品类目Service接口
 * Created by Liu qi.
 * Date: 2018-10-16 21:53
 */
public interface ProductCategoryService {

    ProductCategory findById(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);

}

package com.immoc.sell.service.impl;

import com.immoc.sell.dataobject.ProductCategory;
import com.immoc.sell.repository.ProductCategoryRepository;
import com.immoc.sell.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Description: 商品类目Service接口实现类
 * Created by Liu qi.
 * Date: 2018-10-16 21:58
 */
@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {

    @Autowired
    private ProductCategoryRepository categoryRepository;

    @Override
    public ProductCategory findById(Integer categoryId) {
        return categoryRepository.findById(categoryId).orElse(null);
    }

    @Override
    public List<ProductCategory> findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList) {
        return categoryRepository.findByCategoryTypeIn(categoryTypeList);
    }

    @Override
    public ProductCategory save(ProductCategory productCategory) {
        return categoryRepository.save(productCategory);
    }
}

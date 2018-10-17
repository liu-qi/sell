package com.immoc.sell.service.impl;

import com.immoc.sell.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryServiceImplTest {

    @Autowired
    private ProductCategoryServiceImpl categoryService;

    @Test
    public void findById() {
        ProductCategory productCategory = categoryService.findById(2);
        Assert.assertEquals(new Integer(2), productCategory.getCategoryId());
    }

    @Test
    public void findAll() {
        List<ProductCategory> productCategoryList = categoryService.findAll();
        Assert.assertNotEquals(0, productCategoryList.size());
    }

    @Test
    public void findByCategoryTypeIn() {
        List<ProductCategory> productCategoryList = categoryService.findByCategoryTypeIn(Arrays.asList(10, 30));
        Assert.assertEquals(2, productCategoryList.size());
    }

    @Test
    public void save() {
        ProductCategory productCategory = new ProductCategory("点击最多", 50);
        ProductCategory result = categoryService.save(productCategory);
        Assert.assertNotNull(result);
    }
}
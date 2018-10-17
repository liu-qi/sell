package com.immoc.sell.repository;

import com.immoc.sell.dataobject.ProductCategory;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.List;

/**
 * Description: 商品类目DAO接口测试类
 * Created by Liu qi.
 * Date: 2018-10-15 22:09
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ProductCategoryRepositoryTest {

    @Autowired
    private ProductCategoryRepository categoryRepository;

    @Test
    public void testFindById() {
        ProductCategory productCategory = categoryRepository.findById(2).get();
//        ProductCategory productCategory = categoryRepository.findOne(1);  2.0版本之前的写法
//        ProductCategory productCategory = categoryRepository.getOne(1);
        log.info("=== 测试 findById ===> {}", productCategory);
    }

    @Test
    @Transactional      // Spring Test中的Transactional注解不同于事务注解，这里无论测试结果如何都进行回滚，保证测试后环境的干净
    public void testSave() {
        log.info("=== 测试 save ===>");
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryName("狗狗的最爱");
        productCategory.setCategoryType(40);
        Assert.assertNotNull(categoryRepository.save(productCategory));
    }

    @Test
    public void testUpdate() {
        log.info("=== 测试 update ===>");
        ProductCategory productCategory = categoryRepository.findById(2).get();
        productCategory.setCategoryName("大家的最爱3");
        categoryRepository.save(productCategory);
    }

    @Test
    public void testFindByCategoryTypeIn() {
        List<Integer> categoryTypeList = Arrays.asList(20, 30, 40);
        List<ProductCategory> resultList = categoryRepository.findByCategoryTypeIn(categoryTypeList);
        Assert.assertNotEquals(0, resultList.size());
    }
}
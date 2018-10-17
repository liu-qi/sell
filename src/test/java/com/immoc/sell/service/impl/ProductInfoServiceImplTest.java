package com.immoc.sell.service.impl;

import com.immoc.sell.dataobject.ProductInfo;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

/**
 * Description: 商品信息Service接口测试类
 * Created by Liu qi.
 * Date: 2018-10-17 22:23
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ProductInfoServiceImplTest {

    @Autowired
    private ProductInfoServiceImpl productInfoService;

    @Test
    public void findById() {
        ProductInfo result = productInfoService.findById("1004");
        Assert.assertEquals("1004", result.getProductId());
    }

    @Test
    public void findUpAll() {
        List<ProductInfo> result = productInfoService.findUpAll();
        Assert.assertEquals(3, result.size());
    }

    @Test
    public void findAll() {
//        PageRequest pageRequest = new PageRequest(0, 2);  2.0这个方法过时了
        Page<ProductInfo> result = productInfoService.findAll(PageRequest.of(2, 2));
        for (ProductInfo productInfo : result) {
            log.info(" ---> {}", productInfo.toString());
        }
        Assert.assertNotNull(result);
    }

    @Test
    public void save() {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("1004");
        productInfo.setProductName("蛋炒饭");
        productInfo.setProductPrice(new BigDecimal(12.8));
        productInfo.setProductStock(92);
        productInfo.setProductIcon("蛋炒饭.jpg");
        productInfo.setProductDescription("好吃的不得了!!!");
        productInfo.setProductStatus(0);
        productInfo.setCategoryType(50);

        ProductInfo result = productInfoService.save(productInfo);
        Assert.assertNotNull(result);
    }
}
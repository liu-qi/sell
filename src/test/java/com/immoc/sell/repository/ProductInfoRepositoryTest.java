package com.immoc.sell.repository;

import com.immoc.sell.dataobject.ProductInfo;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

/**
 * Description: 商品信息DAO接口测试类
 * Created by Liu qi.
 * Date: 2018-10-16 22:31
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ProductInfoRepositoryTest {

    @Autowired
    private ProductInfoRepository productInfoRepository;

    @Test
    public void testSave() {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("1001");
        productInfo.setProductName("酸菜包");
        productInfo.setProductPrice(new BigDecimal(2.5));
        productInfo.setProductStock(100);
        productInfo.setProductIcon("酸菜包.jpg");
        productInfo.setProductDescription("很好次的酸菜包");
        productInfo.setProductStatus(0);
        productInfo.setCategoryType(40);

        ProductInfo result = productInfoRepository.save(productInfo);
        Assert.assertNotNull(result);
    }

    @Test
    public void testFindByProductStatus() {
        List<ProductInfo> result = productInfoRepository.findByProductStatus(0);
        Assert.assertEquals("1001", result.get(0).getProductId());
    }
}
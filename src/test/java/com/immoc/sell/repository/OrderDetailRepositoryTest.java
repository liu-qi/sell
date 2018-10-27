package com.immoc.sell.repository;

import com.immoc.sell.dataobject.OrderDetail;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderDetailRepositoryTest {

    @Autowired
    private OrderDetailRepository repository;

    @Test
    public void saveTest() {
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setDetailId("800021");
        orderDetail.setOrderId("200020");
        orderDetail.setProductIcon("http://xxxx.jpg");
        orderDetail.setProductId("1005");
        orderDetail.setProductName("炸酱面");
        orderDetail.setProductPrice(new BigDecimal(8.80));
        orderDetail.setProductQuantity(1);

        OrderDetail result = repository.save(orderDetail);
        Assert.assertNotNull(result);
    }

    @Test
    public void findByOrderId() {
        List<OrderDetail> orderDetailList = repository.findByOrderId("200020");
        Assert.assertEquals(2, orderDetailList.size());
    }

}
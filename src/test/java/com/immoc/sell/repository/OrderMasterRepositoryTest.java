package com.immoc.sell.repository;

import com.immoc.sell.dataobject.OrderMaster;
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

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class OrderMasterRepositoryTest {

    @Autowired
    private OrderMasterRepository repository;

    private final String OPENID = "110110";

    @Test
    public void saveTest() {
        OrderMaster orderMaster = new OrderMaster();
        orderMaster.setOrderId("200022");
        orderMaster.setBuyerName("帅哥");
        orderMaster.setBuyerPhone("13435252245");
        orderMaster.setBuyerAddress("中国上海");
        orderMaster.setBuyerOpenid(OPENID);
        orderMaster.setOrderAmount(new BigDecimal(28));

        OrderMaster result = repository.save(orderMaster);
        Assert.assertNotNull(result);
    }

    @Test
    public void findByBuyerOpenid() {

        Page<OrderMaster> result = repository.findByBuyerOpenid(OPENID, PageRequest.of(0, 6));
        for (OrderMaster orderMaster : result.getContent()) {
            log.info("---> {}", orderMaster);
        }

        Assert.assertNotEquals(0, result.getTotalElements());
    }

}
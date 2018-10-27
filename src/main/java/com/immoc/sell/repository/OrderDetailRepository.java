package com.immoc.sell.repository;

import com.immoc.sell.dataobject.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Description: 订单详情DAO接口
 * Created by Liu qi.
 * Date: 2018-10-27 10:33
 */
public interface OrderDetailRepository extends JpaRepository<OrderDetail, String> {

    List<OrderDetail> findByOrderId(String orderId);

}


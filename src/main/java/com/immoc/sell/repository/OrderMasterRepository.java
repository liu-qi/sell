package com.immoc.sell.repository;

import com.immoc.sell.dataobject.OrderMaster;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Description: 订单主表DAO接口
 * Created by Liu qi.
 * Date: 2018-10-27 10:34
 */
public interface OrderMasterRepository extends JpaRepository<OrderMaster, String> {

    Page<OrderMaster> findByBuyerOpenid(String buyerOpenid, Pageable pageable);

}

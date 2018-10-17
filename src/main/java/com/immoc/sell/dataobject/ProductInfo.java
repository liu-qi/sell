package com.immoc.sell.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * Description: 商品信息实体类
 * Created by Liu qi.
 * Date: 2018-10-16 22:24
 */
@Entity
@Data
public class ProductInfo {

    /**
     * 商品ID(非自增)
     */
    @Id
    private String productId;

    /**
     * 商品名称
     */
    private String productName;

    /**
     * 单价
     */
    private BigDecimal productPrice;

    /**
     * 库存
     */
    private Integer productStock;

    /**
     * 描述
     */
    private String productDescription;

    /**
     * 小图
     */
    private String productIcon;

    /**
     * 商品状态,0正常1下架
     */
    private Integer productStatus;

    /**
     * 类目编号
     */
    private Integer categoryType;

}

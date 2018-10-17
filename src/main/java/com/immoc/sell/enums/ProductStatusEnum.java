package com.immoc.sell.enums;

import lombok.Getter;

/**
 * Description: 商品状态枚举类
 * Created by Liu qi.
 * Date: 2018-10-17 22:12
 */
@Getter
public enum ProductStatusEnum {

    UP(0, "在架"), DOWN(1, "下架");

    private Integer code;
    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}

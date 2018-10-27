package com.immoc.sell.enums;

import lombok.Getter;

/**
 * Description: 支付状态枚举
 * Created by Liu qi.
 * Date: 2018-10-27 10:25
 */
@Getter
public enum PayStatusEnum {

    WAIT(0, "等待支付"),
    SUCCESS(1, "支付成功");

    private Integer code;

    private String message;

    PayStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

}

package com.immoc.sell.vo;

import lombok.Data;

/**
 * Description: Web Controller 统一返回对象
 * Created by Liu qi.
 * Date: 2018-10-23 21:26
 */
@Data
public class ResultVO<T> {

    /**
     * 错误码
     */
    private Integer code;

    /**
     * 提示信息
     */
    private String msg;

    /**
     * 具体数据
     */
    private T data;

}

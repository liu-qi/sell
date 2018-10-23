package com.immoc.sell.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * Description: 商品（包含类目）
 * Created by Liu qi.
 * Date: 2018-10-23 21:35
 */
@Data
public class ProductVO {

    @JsonProperty("name")
    private String categoryName;

    @JsonProperty("type")
    private Integer categoryType;

    @JsonProperty("foods")
    private List<ProductInfoVO> productInfoVOList;

    public ProductVO() {
    }

    public ProductVO(String categoryName, Integer categoryType, List<ProductInfoVO> productInfoVOList) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
        this.productInfoVOList = productInfoVOList;
    }
}

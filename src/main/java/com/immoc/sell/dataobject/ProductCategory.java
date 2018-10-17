package com.immoc.sell.dataobject;


import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Description: 商品类目实体类
 * Created by Liu qi.
 * Date: 2018-10-15 22:00
 */
@Entity
@DynamicUpdate  // 动态更新策略
@Data           // Lombok 在项目打包构建时，自动生成属性的setter getter toString方法
public class ProductCategory {

    /**
     * 类目ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer categoryId;

    /**
     * 类目名字
     */
    private String categoryName;

    /**
     * 类目编号
     */
    private Integer categoryType;

    public ProductCategory() {
    }

    public ProductCategory(String categoryName, Integer categoryType) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }

}

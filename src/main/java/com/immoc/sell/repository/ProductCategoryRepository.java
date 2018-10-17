package com.immoc.sell.repository;

import com.immoc.sell.dataobject.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Description: 商品类目DAO接口
 * Created by Liu qi.
 * Date: 2018-10-15 22:09
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Integer> {

    /**
     * 根据categoryType集合查询ProductCategory列表(方法名为固定写法)
     *
     * @param categoryTypeList categoryType集合
     * @return ProductCategory列表
     */
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

}

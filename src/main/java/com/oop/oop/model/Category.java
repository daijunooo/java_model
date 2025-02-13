package com.oop.oop.model;

import com.oop.oop.entity.CategoryEntity;
import com.oop.oop.entity.GoodsEntity;
import com.oop.oop.service.GoodsService;

/**
 * @author tommy dai
 * @date 2023/1/20
 */
public class Category extends CategoryEntity {

    public Goods goods() {
        return service(GoodsService.class).lambdaQuery()
                .eq(GoodsEntity::getCategory, this.getId())
                .one();
    }
}

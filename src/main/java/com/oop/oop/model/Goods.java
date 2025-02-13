package com.oop.oop.model;

import com.oop.oop.entity.CategoryEntity;
import com.oop.oop.entity.GoodsEntity;
import com.oop.oop.service.CategoryService;

import java.util.List;

/**
 * @author tommy dai
 * @date 2023/1/20
 */
public class Goods extends GoodsEntity {

    public List<Category> categoryList() {
        return service(CategoryService.class).lambdaQuery()
                .eq(CategoryEntity::getId, this.getCategory())
                .list();
    }
}

package com.oop.oop.model;

import com.oop.oop.entity.CategoryEntity;
import com.oop.oop.entity.GoodsEntity;
import com.oop.oop.service.CategoryService;

/**
 * @author tommy dai
 * @date 2023/1/20
 */
public class Goods extends GoodsEntity {

    /**
     * 商品分类
     *
     * @return List<Category>
     */
    public Category category() {
        return service(CategoryService.class).lambdaQuery()
                .eq(CategoryEntity::getId, this.getCategory())
                .one();
    }

}

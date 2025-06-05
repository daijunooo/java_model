package com.oop.oop.model;

import com.oop.oop.entity.CategoryEntity;
import com.oop.oop.entity.GoodsEntity;
import com.oop.oop.service.GoodsService;

import java.util.List;

/**
 * @author tommy dai
 * @date 2023/1/20
 */
public class Category extends CategoryEntity {

    /**
     * 分类下的商品
     *
     * @return Goods
     */
    public List<Goods> goods() {
        return service(GoodsService.class).lambdaQuery()
                .eq(GoodsEntity::getCategory, this.getId())
                .list();
    }

    /**
     * 修改分类名称
     *
     * @param name 分类名称
     * @return 是否修改成功
     */
    public boolean changeName(String name) {
        return this.setName(name).save();
    }
}

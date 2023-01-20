package com.oop.oop.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.oop.oop.entity.CategoryEntity;
import com.oop.oop.entity.GoodsEntity;

import java.util.List;

/**
 * @author tommy dai
 * @date 2023/1/20
 * 所有方法用 $ 前缀是为了避免与 Entity 里面的方法产生冲突
 */
public class Category extends CategoryEntity {

    /**
     * 获取当前分类的所有商品
     */
    public List<Goods> $getGoods() {
        return new GoodsEntity().$repo().selectList(Wrappers.<Goods>lambdaQuery().eq(Goods::getCategory, getId()));
    }

}

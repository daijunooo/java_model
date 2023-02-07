package com.oop.oop.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.oop.oop.entity.GoodsEntity;

import java.util.List;
import java.util.Objects;

/**
 * @author tommy dai
 * @date 2023/1/20
 * <p>
 * 所有方法用 $ 前缀是为了避免与 Entity 里面的方法产生冲突
 */
public class Goods extends GoodsEntity {

    @TableField(exist = false)
    private Category $category;

    /**
     * 商品上架
     */
    public int $up() {
        setIsUp(1);
        return $update();
    }

    /**
     * 商品下架
     */
    public int $down() {
        setIsUp(0);
        return $update();
    }

    /**
     * 商品更新
     */
    public int $update() {
        return $repo().updateById(this);
    }

    /**
     * 商品保存入库
     */
    public int $save() {
        return $repo().insert(this);
    }

    /**
     * 获取商品分类
     */
    public Category $getCategory() {
        return $getCategory(false);
    }

    /**
     * 获取商品分类
     */
    public Category $getCategory(boolean refresh) {
        if (Objects.isNull($category) || refresh) {
            $category = new Category().$repo().selectById(getId());
        }
        return $category;
    }

    /**
     * 设置商品分类
     */
    public int $setCategory(Category category) {
        setCategory(category.getId());
        return $update();
    }

    /**
     * 设置商品分类
     */
    public int $setCategory(Long category) {
        setCategory(category);
        return $update();
    }

    /**
     * 删除商品
     */
    public int $delete() {
        return $repo().deleteById(this);
    }

    /**
     * 获取当前商品同分类的所有商品
     */
    public List<Goods> $sameCategoryGoods() {
        return $repo().selectList(Wrappers.<Goods>lambdaQuery().eq(Goods::getCategory, getCategory()));
    }
}

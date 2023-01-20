package com.oop.oop.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.oop.oop.mapper.GoodsMapper;
import com.oop.oop.model.Category;
import com.oop.oop.model.Goods;
import com.oop.oop.service.GoodsService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author tommy dai
 * @date 2023/1/20
 */
@Service
public class GoodsServiceImpl extends ServiceImpl<GoodsMapper, Goods> implements GoodsService {

    @Override
    public Goods getOne(Long id) {
        return getById(id);
    }

    @Override
    public int up(Long id) {
        Goods goods = getOne(id);
        return goods.$up();
    }

    @Override
    public Category getCategory(Long id) {
        return getOne(id).$getCategory();
    }

    @Override
    public void test(Long id) {

        /**
         * 所有操作的起点是获取一个商品模型 goods
         * 基于这个模型可以获取和它相关的所有信息
         * 比如可以获取到商品分类信息模型
         * 由于可以获取到所有和商品相关联的模型，所以业务逻辑的处理就是对这些模型的处理
         * 我们不必关心这些模型是怎么获取到的，只需要理解业务逻辑需要操作哪些模型
         * 调用相关模型的方法即可完成业务逻辑
         *
         * 在任意地方只要拿到了商品信息，就相当于商品的其他信息可以轻松拿到，不需要额外写查询
         * 反过来说，如果拿到任意商品附属信息，也可以拿到商品信息，并且可以操作已定义好的业务逻辑
         * 所有的业务逻辑被解耦成一个个模型的固定操作，这些操作的自由组合就是完整的业务逻辑
         * 也就是完全的oop开发模式
         *
         */
        Goods goods = getById(id);

        // 获取当前商品同分类的所有商品
        List<Goods> sameCategoryGoods = goods.$sameCategoryGoods();
        System.err.println(sameCategoryGoods);

        // 商品上架
        goods.$up();

        // 商品下架
        goods.$down();

        // 获取该商品分类
        Category category = goods.$getCategory();
        System.err.println(category);

        // 获取分类下商品
        List<Goods> goodsList = category.$getGoods();
        System.err.println(goodsList);
    }
}

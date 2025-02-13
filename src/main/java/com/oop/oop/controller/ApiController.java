package com.oop.oop.controller;

import com.oop.oop.entity.GoodsEntity;
import com.oop.oop.model.Category;
import com.oop.oop.model.Goods;
import com.oop.oop.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author tommy dai
 * @date 2023/1/20
 */
@RestController
public class ApiController {

    @Autowired
    private GoodsService goodsService;

    @GetMapping("/test")
    public void test() {
        Goods one = goodsService.lambdaQuery()
                .eq(GoodsEntity::getId, 2).one();

        one.setGoodsName("测试商品");
        one.saveOrUpdate();

        List<Goods> list = one.query().list();
        System.err.println(list);

        List<Category> categories = one.categoryList();

        System.err.println(categories);

        categories.forEach(category -> {
            System.err.println(category.goods());
        });
    }
}

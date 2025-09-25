package com.oop.oop.controller;

import com.oop.oop.model.Category;
import com.oop.oop.model.Goods;
import com.oop.oop.service.GoodsService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @author tommy dai
 * @date 2025/9/25
 */
@SpringBootTest
class ApiControllerTest {

    @Autowired
    private GoodsService goodsService;

    @Test
    void test1() {
        List<Goods> list = goodsService.getList();
        list.forEach(goods -> {
            Category category = goods.category();
            System.err.println(category);
        });
    }
}
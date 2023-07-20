package com.oop.oop.service;

import com.oop.oop.OopApplication;
import com.oop.oop.entity.Goods;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = OopApplication.class)
class CategoryServiceTest {

    @Autowired
    CategoryService categoryService;
    @Autowired
    GoodsService goodsService;

    @Test
    void repository() {
        Goods all = goodsService.repository().findById(1L).orElseGet(Goods::new);
        System.err.println(all.getCategory());
    }
}
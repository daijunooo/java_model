package com.oop.oop.service;

import com.oop.oop.OopApplication;
import com.oop.oop.entity.Category;
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
        Goods goods = goodsService.getById(1L);

        // 获取关系数据
        Category category = goods.$category();

        System.err.println(category);
    }
}
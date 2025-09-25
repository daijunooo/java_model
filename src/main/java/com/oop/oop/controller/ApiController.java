package com.oop.oop.controller;

import com.oop.oop.model.Category;
import com.oop.oop.model.Goods;
import com.oop.oop.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
        Goods goods = goodsService.getById(1);

        // 通过模型关联访问分类信息，面向对象的开发
        Category category = goods.category();

        System.err.println(category);
    }
}

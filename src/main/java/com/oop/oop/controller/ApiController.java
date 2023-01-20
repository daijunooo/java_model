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
        goodsService.test(1L);
    }

    @GetMapping("/getOne")
    public Goods getOne() {
        Goods goods = goodsService.getOne(1L);
        System.err.println(goods);
        return goods;
    }

    @GetMapping("/up")
    public int up() {
        Goods goods = goodsService.getOne(1L);
        System.out.println(goods);
        return goods.$up();
    }

    @GetMapping("/down")
    public int down() {
        Goods goods = goodsService.getOne(1L);
        System.out.println(goods);
        return goods.$down();
    }

    @GetMapping("/category")
    public Category category() {
        Category category = goodsService.getCategory(1L);
        System.out.println(category);
        return category;
    }
}

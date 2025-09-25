package com.oop.oop.controller;

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
        List<Goods> goods = goodsService.getList();

        Category category = goods.get(0).category();

        System.err.println(category);

        System.err.println(goods);
    }
}

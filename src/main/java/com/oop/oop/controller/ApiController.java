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
        Goods goods = goodsService.getById(1);

        // 通过模型关联访问分类信息，面向对象的开发
        Category category = goods.category();

        // 修改分类名称，内部实现了保存逻辑，简化了代码
        boolean isOk = category.changeName("分类名称");

        // 新增一个分类
        Category newCategory = new Category();
        newCategory.setId(3L);
        newCategory.setName("新分类");
        newCategory.save();

        // 模型之间各司其职，互相关联
        List<Goods> goodsList = category.goods();
    }
}

package com.oop.oop.service;

import com.oop.oop.model.Category;
import com.oop.oop.model.Goods;

/**
 * @author tommy dai
 * @date 2023/1/20
 */
public interface GoodsService {

    Goods getOne(Long id);

    int up(Long id);

    Category getCategory(Long id);

    void test(Long id);
}

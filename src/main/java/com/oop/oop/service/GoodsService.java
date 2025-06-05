package com.oop.oop.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.oop.oop.model.Goods;

import java.util.List;

/**
 * @author tommy dai
 * @date 2023/1/20
 */
public interface GoodsService extends IService<Goods> {

    public List<Goods> getList();
}

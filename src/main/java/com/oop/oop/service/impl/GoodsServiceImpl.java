package com.oop.oop.service.impl;

import com.oop.oop.mapper.GoodsMapper;
import com.oop.oop.model.Goods;
import com.oop.oop.service.GoodsService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author tommy dai
 * @date 2023/1/20
 */
@Service
public class GoodsServiceImpl extends BaseServiceImpl<GoodsMapper, Goods> implements GoodsService {

    @Override
    public List<Goods> getList() {
        return select().list();
    }
}

package com.oop.oop.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.oop.oop.mapper.GoodsMapper;
import com.oop.oop.model.Goods;
import com.oop.oop.service.GoodsService;
import org.springframework.stereotype.Service;

/**
 * @author tommy dai
 * @date 2023/1/20
 */
@Service
public class GoodsServiceImpl extends ServiceImpl<GoodsMapper, Goods> implements GoodsService {
}

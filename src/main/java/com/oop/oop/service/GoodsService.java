package com.oop.oop.service;

import com.oop.oop.entity.Goods;
import com.oop.oop.repository.GoodsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author tommy dai
 * @date 2023/1/20
 */
@Service
public class GoodsService {

    @Autowired
    private GoodsRepository goodsRepository;


    public GoodsRepository repository() {
        return goodsRepository;
    }

    public Goods getById(Long id) {
        return goodsRepository.findById(id).orElseGet(Goods::new);
    }

    public List<Goods> getByCategoryId(Long id) {
        return goodsRepository.findByCategoryId(id);
    }

}

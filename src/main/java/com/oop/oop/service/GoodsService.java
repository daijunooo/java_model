package com.oop.oop.service;

import com.oop.oop.repository.GoodsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

}

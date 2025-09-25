package com.oop.oop.service;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author tommy dai
 * @date 2023/1/20
 */
@Component
public class Service implements ApplicationContextAware {

    public static GoodsService goods;
    public static CategoryService category;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        goods = applicationContext.getBean(GoodsService.class);
        category = applicationContext.getBean(CategoryService.class);
    }


}

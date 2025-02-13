package com.oop.oop.entity;

import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.oop.oop.utils.ServiceFactory;

/**
 * @author tommy dai
 * @date 2023/1/20
 */
public abstract class BaseEntity<T extends IService<E>, E> {

    public abstract Class<T> serviceClass();


    public <S> S service(Class<S> clazz) {
        return ServiceFactory.getBean(clazz);
    }

    public boolean saveOrUpdate() {
        return this.service(serviceClass()).saveOrUpdate((E) this);
    }

    public boolean remove() {
        return this.service(serviceClass()).removeById((E) this);
    }

    public LambdaQueryChainWrapper<E> query() {
        return this.service(serviceClass()).lambdaQuery();
    }

}

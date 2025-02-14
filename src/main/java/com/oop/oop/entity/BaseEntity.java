package com.oop.oop.entity;

import com.baomidou.mybatisplus.extension.service.IService;
import com.oop.oop.utils.ServiceFactory;

/**
 * @author tommy dai
 * @date 2023/1/20
 */
public abstract class BaseEntity<T extends IService<E>, E> {

    protected abstract Class<T> serviceClass();


    protected T service() {
        return ServiceFactory.getBean(serviceClass());
    }

    protected <S> S service(Class<S> clazz) {
        return ServiceFactory.getBean(clazz);
    }

}

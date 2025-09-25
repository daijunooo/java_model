package com.oop.oop.utils;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * @author tommy dai
 * @date 2023/1/20
 */
@Component
public class ServiceFactory implements ApplicationContextAware {

    private static final ConcurrentMap<Class<?>, Object> beanCache = new ConcurrentHashMap(256);
    private static ApplicationContext context;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        context = applicationContext;
    }

    public static <T> T getBean(Class<T> clazz) {
        Object object = beanCache.get(clazz);
        if (object == null) {
            return clazz.cast(beanCache.computeIfAbsent(clazz, context::getBean));
        }
        return clazz.cast(object);
    }

}

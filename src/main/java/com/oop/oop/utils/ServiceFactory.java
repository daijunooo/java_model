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

    public static ApplicationContext context;
    private static final ConcurrentMap<Class<?>, Object> beanCache = new ConcurrentHashMap<>();

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        context = applicationContext;
    }

    public static <T> T getBean(Class<T> clazz) {
        return clazz.cast(beanCache.computeIfAbsent(clazz, context::getBean));
    }

}

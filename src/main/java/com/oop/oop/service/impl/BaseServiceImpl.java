package com.oop.oop.service.impl;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.oop.oop.entity.BaseEntity;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * @author tommy dai
 * @date 2023/1/20
 */
@Service
public class BaseServiceImpl<M extends BaseMapper<T>, T extends BaseEntity> extends ServiceImpl<M, T> {

    protected LambdaQueryChainWrapper<T> select() {
        return this.lambdaQuery().eq(T::getIsDelete, 0);
    }

    protected <T> List<T> safe(List<T> list) {
        return Optional.ofNullable(list).orElse(Collections.emptyList());
    }

    protected <T> Optional<T> safe(T object) {
        return Optional.ofNullable(object);
    }

}
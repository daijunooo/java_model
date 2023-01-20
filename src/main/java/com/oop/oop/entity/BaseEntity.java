package com.oop.oop.entity;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * @author tommy dai
 * @date 2023/1/20
 */
public interface BaseEntity<T extends BaseMapper<?>> {
    T $repo();
}

package com.oop.oop.entity;

import com.oop.oop.mapper.CategoryMapper;
import com.oop.oop.utils.ServiceFactory;
import lombok.Data;

/**
 * @author tommy dai
 * @date 2023/1/20
 */
@Data
public class CategoryEntity implements BaseEntity<CategoryMapper> {
    private Long id;
    private String name;

    @Override
    public CategoryMapper $repo() {
        return ServiceFactory.getBean(CategoryMapper.class);
    }
}

package com.oop.oop.entity;

import com.oop.oop.model.Category;
import com.oop.oop.service.CategoryService;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author tommy dai
 * @date 2023/1/20
 */
@Getter
@Setter
@ToString
public class CategoryEntity extends BaseEntity<CategoryService, Category> {
    private Long id;
    private String name;


    @Override
    public Class<CategoryService> serviceClass() {
        return CategoryService.class;
    }
}

package com.oop.oop.entity;

import com.oop.oop.model.Category;
import com.oop.oop.service.CategoryService;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author tommy dai
 * @date 2023/1/20
 */
@Data
@Accessors(chain = true)
public class CategoryEntity extends BaseEntity<CategoryService, Category> {

    private String name;

    @Override
    protected Class<CategoryService> serviceClass() {
        return CategoryService.class;
    }
}

package com.oop.oop.service;

import com.oop.oop.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author tommy dai
 * @date 2023/1/20
 */
@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;


    public CategoryRepository repository() {
        return categoryRepository;
    }


}

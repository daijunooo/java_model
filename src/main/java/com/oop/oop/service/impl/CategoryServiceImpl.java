package com.oop.oop.service.impl;

import com.oop.oop.mapper.CategoryMapper;
import com.oop.oop.model.Category;
import com.oop.oop.service.CategoryService;
import org.springframework.stereotype.Service;

/**
 * @author tommy dai
 * @date 2023/1/20
 */
@Service
public class CategoryServiceImpl extends BaseServiceImpl<CategoryMapper, Category> implements CategoryService {

}

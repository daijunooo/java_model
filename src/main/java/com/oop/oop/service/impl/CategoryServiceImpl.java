package com.oop.oop.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.oop.oop.mapper.CategoryMapper;
import com.oop.oop.model.Category;
import com.oop.oop.service.CategoryService;
import org.springframework.stereotype.Service;

/**
 * @author tommy dai
 * @date 2023/1/20
 */
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {

}

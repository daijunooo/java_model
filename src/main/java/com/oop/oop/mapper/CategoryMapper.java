package com.oop.oop.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.oop.oop.model.Category;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author tommy dai
 * @date 2023/1/20
 */
@Mapper
public interface CategoryMapper extends BaseMapper<Category> {
}

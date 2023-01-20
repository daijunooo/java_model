package com.oop.oop.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.oop.oop.model.Goods;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author tommy dai
 * @date 2023/1/20
 */
@Mapper
public interface GoodsMapper extends BaseMapper<Goods> {
}

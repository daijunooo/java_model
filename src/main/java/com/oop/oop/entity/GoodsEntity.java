package com.oop.oop.entity;

import com.oop.oop.mapper.GoodsMapper;
import com.oop.oop.utils.ServiceFactory;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author tommy dai
 * @date 2023/1/20
 */
@Data
public class GoodsEntity implements BaseEntity<GoodsMapper> {
    private Long id;
    private LocalDateTime createTime;
    private String goodsImages;
    private String goodsName;
    private String goodsPrice;
    private Integer isUp;
    private Long category;

    @Override
    public GoodsMapper $repo() {
        return ServiceFactory.getBean(GoodsMapper.class);
    }
}

package com.oop.oop.entity;

import com.oop.oop.model.Goods;
import com.oop.oop.service.GoodsService;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

/**
 * @author tommy dai
 * @date 2023/1/20
 */
@Getter
@Setter
@ToString
public class GoodsEntity extends BaseEntity<GoodsService, Goods> {
    private Long id;
    private LocalDateTime createTime;
    private String goodsImages;
    private String goodsName;
    private String goodsPrice;
    private Integer isUp;
    private Long category;


    @Override
    public Class<GoodsService> serviceClass() {
        return GoodsService.class;
    }
}

package com.oop.oop.entity;

import com.oop.oop.model.Goods;
import com.oop.oop.service.GoodsService;
import com.oop.oop.service.Service;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

/**
 * @author tommy dai
 * @date 2023/1/20
 */
@Getter
@Setter
@ToString
@Accessors(chain = true)
public class GoodsEntity extends BaseEntity<Goods> {

    private LocalDateTime createTime;
    private String goodsImages;
    private String goodsName;
    private String goodsPrice;
    private Integer isUp;
    private Long category;


    @Override
    protected GoodsService service() {
        return Service.goods;
    }
}

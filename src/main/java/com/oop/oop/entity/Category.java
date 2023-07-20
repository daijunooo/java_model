package com.oop.oop.entity;

import com.oop.oop.ioc.Ioc;
import com.oop.oop.service.GoodsService;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

/**
 * @author tommy dai
 * @date 2023/1/20
 */
@Entity
@Data
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "varchar(64) CHARACTER SET utf8mb4 default ''", nullable = false)
    private String name;

    public List<Goods> $goods() {
        return Ioc.getBean(GoodsService.class).getByCategoryId(id);
    }

}

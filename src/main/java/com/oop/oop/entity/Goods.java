package com.oop.oop.entity;

import com.oop.oop.ioc.Ioc;
import com.oop.oop.service.CategoryService;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * @author tommy dai
 * @date 2023/1/20
 */
@Entity
@Data
public class Goods {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "timestamp default current_timestamp", insertable = false)
    private LocalDateTime createTime;

    @Column(columnDefinition = "varchar(255) CHARACTER SET utf8mb4 default ''", nullable = false)
    private String goodsImages;

    @Column(columnDefinition = "varchar(64) CHARACTER SET utf8mb4 default ''", nullable = false)
    private String goodsName;

    @Column(columnDefinition = "bigint default '0'", nullable = false)
    private Long goodsPrice;

    @Column(columnDefinition = "tinyint default '0'", nullable = false)
    private Integer isUp;

    @Column(columnDefinition = "bigint default '0'", nullable = false)
    private Long categoryId;


    public Category $category() {
        return Ioc.getBean(CategoryService.class).repository().findById(categoryId).orElseGet(Category::new);
    }

}

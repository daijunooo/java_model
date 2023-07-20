package com.oop.oop.entity;

import lombok.Data;

import javax.persistence.*;

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

}

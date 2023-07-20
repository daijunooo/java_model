package com.oop.oop.repository;

import com.oop.oop.entity.Goods;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GoodsRepository extends JpaRepository<Goods, Long> {

    List<Goods> findByCategoryId(Long id);
}

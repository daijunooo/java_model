package com.oop.oop.entity;

import com.baomidou.mybatisplus.extension.service.IService;
import lombok.Getter;

/**
 * @author tommy dai
 * @date 2023/1/20
 */
@Getter
public abstract class BaseEntity<E extends BaseEntity<E>> {

    private Long id;
    private Integer isDelete;

    protected abstract <T extends IService> T service();


    public E setId(Long id) {
        this.id = id;
        return self();
    }

    public E setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
        return self();
    }

    public boolean save() {
        return service().saveOrUpdate(self());
    }

    public boolean delete() {
        return this.setIsDelete(1).save();
    }

    @SuppressWarnings("unchecked")
    private E self() {
        return (E) this;
    }

}

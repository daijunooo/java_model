package com.oop.oop.entity;

import com.baomidou.mybatisplus.extension.service.IService;
import com.oop.oop.utils.ServiceFactory;
import lombok.Getter;

/**
 * @author tommy dai
 * @date 2023/1/20
 */
@Getter
public abstract class BaseEntity<T extends IService<E>, E extends BaseEntity<T, E>> {

    private Long id;
    private Integer isDelete;

    protected abstract Class<T> serviceClass();


    public E setId(Long id) {
        this.id = id;
        return self();
    }

    public E setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
        return self();
    }

    protected T service() {
        return ServiceFactory.getBean(serviceClass());
    }

    protected <S> S service(Class<S> clazz) {
        return ServiceFactory.getBean(clazz);
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

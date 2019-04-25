package com.jck.service.base;

/**
 * 【弃用】Service 层的所有接口的基类，用于声明多数【常用】方法
 * IxxxService 接口继承该类，然后声明一些特有方法即可。
 *
 * 若使用 MyBatis Generator 逆工程生成 mapper 映射，则会提供
 * 【常用】方法，无需再使用这个基类。
 *
 * @param <T>
 */
public interface IBaseService<T> {
    T findById(Integer id);

    T findByUUID(String uuid);

    void deleteById(Integer id);

    void deleteByUUID(String uuid);

    void update(T t);

    void insert(T t);
}

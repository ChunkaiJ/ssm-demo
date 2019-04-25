package com.jck.mapper.base;

/**
 * 【弃用】
 * Mapper 的基类，抽取绝大多数 Mapper 都会有的操作；
 * 通过继承，减少冗余代码，需要注意一些特殊情况；
 * 如：id 有可能是 int 或 uuid
 *
 * 若使用了 MyBatis 逆向工程，则该方法可以考虑删除。
 * 因为逆向工程会自动为每个表生成【常见】的操作方法，
 * 不常见的操作方法也很少会多个表公用，故这个类只做演示。
 *
 * @param <T>
 */
public interface BaseMapper<T> {
    T findById(Integer id);

    T findByUUID(String uuid);

    void deleteById(Integer id);

    void deleteByUUID(String uuid);

    void update(T t);

    void insert(T t);
}

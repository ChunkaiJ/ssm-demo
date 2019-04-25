package com.jck.service.base;

import com.jck.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 统一管理 dao：
 * 即创建所有的 Mapper 对象（由 Spring 注入）以便 xxxServiceImpl 调用
 *
 * @param <T>
 */
public abstract class BaseServiceImpl<T> implements IBaseService<T> {
    @Autowired
    protected UserMapper userMapper;
}

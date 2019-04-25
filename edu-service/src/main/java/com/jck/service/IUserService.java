package com.jck.service;

import com.jck.model.User;
import com.jck.service.base.IBaseService;

public interface IUserService extends IBaseService<User> {
    // 除开 IBaseService 接口中有的，写特有的方法
    User login(String username, String password);
}

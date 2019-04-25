package com.jck.web.controller.base;

import java.lang.reflect.ParameterizedType;

/**
 * 抽象类 BaseController<T>
 *     提供一些【通用】的 url 请求页面，多个控制器继承它后，
 *     遇到这些【通用】请求页面，直接返回该基类中定义的【静态变量】即可。
 *
 * @param <T>
 */
public abstract class BaseController<T> {

    private static final String MANAGE = "/manage";
    private static final String INFO = "/info";
    private static final String EDIT = "/edit";

    protected static String MANAGE_PAGE;
    protected static String INFO_PAGE;
    protected static String EDIT_PAGE;

    public BaseController() {
        // 1. 获取 T 的真实类型
        ParameterizedType type = (ParameterizedType) this.getClass().getGenericSuperclass();
        Class<?> moduleClass = (Class<?>) type.getActualTypeArguments()[0];

        // 2. 获取模块名，如：User => /user
        String moduleName = "/" + moduleClass.getSimpleName().toLowerCase();

        // 3. 给静态页面赋值
        MANAGE_PAGE = moduleName + MANAGE;
        INFO_PAGE = moduleName + INFO;
        EDIT_PAGE = moduleName + EDIT;
    }
}

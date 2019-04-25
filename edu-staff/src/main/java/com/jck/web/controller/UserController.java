package com.jck.web.controller;

import com.jck.model.User;
import com.jck.service.IUserService;
import com.jck.web.controller.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController extends BaseController<User> {
    @Autowired
    private IUserService userService;

    @RequestMapping("login")
    public String login() {
        return "/default";
    }

    @RequestMapping("manage")
    public String manage() {
        return MANAGE_PAGE;
    }

    @RequestMapping("info")
    public String info() {
        return INFO_PAGE;
    }

    @RequestMapping("edit")
    public String edit() {
        return EDIT_PAGE;
    }

    @RequestMapping("update")
    public String update() {
        return "/user/update";
    }

    @RequestMapping("login4")
    public String login4() {
        return "/default";
    }

}

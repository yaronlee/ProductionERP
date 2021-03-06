package com.cskaoyan.controller;

import com.cskaoyan.domain.device.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * Demo class
 *
 * @Author lyboy
 * @Date 2018/12/6 12:39
 **/
@Controller
public class mainController {
    @RequestMapping("/{name}")
    public String main(@PathVariable String name, HttpSession session){
        User activeUser=new User();
        activeUser.setUsername("aa");
        activeUser.setPassword("aa");
        activeUser.setLocked("1");
        activeUser.setRolename("订单管理员");
        session.setAttribute("activeUser",activeUser);
        return name;
    }
}

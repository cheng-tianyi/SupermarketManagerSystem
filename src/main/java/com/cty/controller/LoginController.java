package com.cty.controller;

import com.cty.entity.User;
import com.cty.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class LoginController {
    @Autowired
    private UserService userService;
    @RequestMapping("/login")
    public String login(User user, HttpSession session) {
        User loginInfo = userService.login(user);
        if (loginInfo!=null) {
            session.setAttribute("user", loginInfo);
            System.out.println(loginInfo);
            return "sale";
        }else {
            return "login";
        }
    }
    @RequestMapping("/userlist")
    public String userlist() {
        return "/userList";
    }
}

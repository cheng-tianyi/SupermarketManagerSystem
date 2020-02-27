package com.cty.controller;

import com.cty.entity.User;
import com.cty.entity.pojo.PageResult;
import com.cty.entity.pojo.Result;
import com.cty.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("findPage")
    public PageResult findPage(Integer page, Integer pageSize,@RequestBody User user){
        PageResult userList = userService.findPage(page,pageSize,user);
        return userList;
    }
    @RequestMapping("userAdd")
    public Result userAdd(@RequestBody User user){
        try {
            userService.userAdd(user);
            return new Result(true,"添加成功");
        }catch (Exception e){
            return new Result(false,"添加失败");
        }

    }
    @RequestMapping("update")
    public Result update(@RequestBody User user){
        try {
            userService.update(user);
            return new Result(true,"更新成功");
        }catch (Exception e){
            return new Result(false,"更新失败");
        }

    }
    @RequestMapping("updatePwd")
    public Result updatePwd(String password,String oldPassword,HttpSession session){
        User user =(User) session.getAttribute("user");
        if(!user.getUserPassword().equals(oldPassword)){
            return new Result(false,"旧密码不正确");
        }
        try {
            user.setUserPassword(password);
            userService.update(user);
            return new Result(true,"更新成功");
        }catch (Exception e){
            return new Result(false,"更新失败");
        }

    }
    @RequestMapping("deleteUser")
    public Result deleteUser(String userCode){
        try {
            userService.deleteByUserCode(userCode);
            return new Result(true,"删除成功");
        }catch (Exception e){
            return new Result(false,"删除失败");
        }

    }
    @RequestMapping("saveSession")
    public void saveSession(@RequestBody User user, HttpSession session){
        session.setAttribute("modifyUser",user);
    }
    @RequestMapping("getSessionUser")
    public User getSessionUser(HttpSession session){
        User user = (User)session.getAttribute("modifyUser");
        return user;
    }
}

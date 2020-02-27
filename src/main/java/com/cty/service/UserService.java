package com.cty.service;

import com.cty.entity.User;
import com.cty.entity.pojo.PageResult;
import com.cty.entity.pojo.Result;

import java.util.List;

public interface UserService {
    /**
     * 登录
     * @param user
     * @return
     */
    User login(User user);

    /**
     * 查询所有
     * @return
     */
    List<User> selectAll();

    /**
     * 分页查询
     * @param page
     * @param pageSize
     * @param user
     * @return
     */
    PageResult findPage(Integer page, Integer pageSize, User user);

    /**
     * 添加用户
     * @param user 用户实体
     * @return
     */
    void userAdd(User user);

    /**
     * 根据用户编码删除
     * @param userCode
     */
    void deleteByUserCode(String userCode);

    /**
     * 更新
     * @param user
     */
    void update(User user);

    /**
     * 更新密码
     * @param password 新密码
     */
    void updatePwd(String password);
}

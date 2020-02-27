package com.cty.service.impl;



import com.cty.dao.UserDao;
import com.cty.entity.User;
import com.cty.entity.UserQuery;
import com.cty.entity.pojo.PageResult;
import com.cty.entity.pojo.Result;
import com.cty.service.UserService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@Slf4j
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public User login(User user) {
        UserQuery query = new UserQuery();
        UserQuery.Criteria criteria = query.createCriteria();
        criteria.andUserCodeEqualTo(user.getUserCode());
        criteria.andUserPasswordEqualTo(user.getUserPassword());
        List<User> users = userDao.selectByExample(query);
        log.debug("-------");
        if(users.size()!=0){
            return users.get(0);
        }
        return null;
    }

    @Override
    public List<User> selectAll() {
        return userDao.selectAll();
    }

    @Override
    public PageResult findPage(Integer page, Integer pageSize, User user) {
        PageHelper.startPage(page,pageSize);
        UserQuery query = new UserQuery();
        UserQuery.Criteria criteria = query.createCriteria();
        if (user!=null){
            if (user.getUserName()!=null&&!"".equals(user.getUserName())){
                criteria.andUserNameEqualTo(user.getUserName());
            }
            if (user.getUserRole()!=null&&0!=user.getUserRole()){
                criteria.andUserRoleEqualTo(user.getUserRole());
            }
        }
        Page<User> userList = (Page<User>)userDao.selectByExample(query);
        PageResult result = new PageResult(userList.getTotal(),userList.getResult());
        return result;
    }

    @Override
    public void userAdd(User user) {
        userDao.insertSelective(user);
    }

    @Override
    public void deleteByUserCode(String userCode) {
        UserQuery query = new UserQuery();
        UserQuery.Criteria criteria = query.createCriteria();
        criteria.andUserCodeEqualTo(userCode);
        userDao.deleteByExample(query);
    }

    @Override
    public void update(User user) {
        userDao.updateByPrimaryKeySelective(user);
    }

    @Override
    public void updatePwd(String password) {

    }
}

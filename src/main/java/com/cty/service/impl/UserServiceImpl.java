package com.cty.service.impl;



import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.cty.dao.UserDao;
import com.cty.entity.Bill;
import com.cty.entity.User;
import com.cty.entity.UserQuery;
import com.cty.entity.pojo.PageResult;
import com.cty.entity.pojo.Result;
import com.cty.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
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
        return userDao.selectByExample(null);
    }

    @Override
    public PageResult findPage(Integer page, Integer pageSize, User user) {
        IPage<User> ipage = new Page<>(page,pageSize);
        LambdaQueryWrapper<User> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(StringUtils.isNotEmpty(user.getUserName()),User::getUserName,user.getUserName());
        wrapper.eq(user.getUserRole()!=0,User::getUserRole,user.getUserRole());
        IPage<User> providerIPage = userDao.selectPage(ipage, wrapper);
        PageResult result = new PageResult(providerIPage.getTotal(),providerIPage.getRecords());
        return result;

//        PageHelper.startPage(page,pageSize);
//        UserQuery query = new UserQuery();
//        UserQuery.Criteria criteria = query.createCriteria();
//        if (user!=null){
//            if (user.getUserName()!=null&&!"".equals(user.getUserName())){
//                criteria.andUserNameEqualTo(user.getUserName());
//            }
//            if (user.getUserRole()!=null&&0!=user.getUserRole()){
//                criteria.andUserRoleEqualTo(user.getUserRole());
//            }
//        }
//        Page<User> userList = (Page<User>)userDao.selectByExample(query);
//        PageResult result = new PageResult(userList.getTotal(),userList.getResult());
//        return result;
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
        userDao.updateById(user);
    }

    @Override
    public void updatePwd(String password) {

    }
}

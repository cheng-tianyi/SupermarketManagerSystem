package com.cty.dao;

import com.cty.entity.User;
import com.cty.entity.UserQuery;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface UserDao extends Mapper<User> {
    int countByExample(UserQuery example);

    int deleteByExample(UserQuery example);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserQuery example);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserQuery example);

    int updateByExample(@Param("record") User record, @Param("example") UserQuery example);
}
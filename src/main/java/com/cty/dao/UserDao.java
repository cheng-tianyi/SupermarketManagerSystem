package com.cty.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cty.entity.User;
import com.cty.entity.UserQuery;
import org.apache.ibatis.annotations.Param;
import java.util.List;

public interface UserDao extends BaseMapper<User> {
    int countByExample(UserQuery example);

    int deleteByExample(UserQuery example);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserQuery example);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserQuery example);

    int updateByExample(@Param("record") User record, @Param("example") UserQuery example);
}
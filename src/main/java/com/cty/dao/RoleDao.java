package com.cty.dao;

import com.cty.entity.Role;
import com.cty.entity.RoleQuery;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface RoleDao extends Mapper<Role> {
    int countByExample(RoleQuery example);

    int deleteByExample(RoleQuery example);

    int insert(Role record);

    int insertSelective(Role record);

    List<Role> selectByExample(RoleQuery example);

    int updateByExampleSelective(@Param("record") Role record, @Param("example") RoleQuery example);

    int updateByExample(@Param("record") Role record, @Param("example") RoleQuery example);
}
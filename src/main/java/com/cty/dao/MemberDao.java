package com.cty.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cty.entity.Member;
import com.cty.entity.MemberQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MemberDao extends BaseMapper<Member> {
    int countByExample(MemberQuery example);

    int deleteByExample(MemberQuery example);

    int deleteByPrimaryKey(Long id);

    int insert(Member record);

    int insertSelective(Member record);

    List<Member> selectByExample(MemberQuery example);

    Member selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Member record, @Param("example") MemberQuery example);

    int updateByExample(@Param("record") Member record, @Param("example") MemberQuery example);

    int updateByPrimaryKeySelective(Member record);

    int updateByPrimaryKey(Member record);
}
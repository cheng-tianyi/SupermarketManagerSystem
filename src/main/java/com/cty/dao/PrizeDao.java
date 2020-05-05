package com.cty.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cty.entity.Prize;
import com.cty.entity.PrizeQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PrizeDao extends BaseMapper<Prize> {
    int countByExample(PrizeQuery example);

    int deleteByExample(PrizeQuery example);

    int deleteByPrimaryKey(Long id);

    int insert(Prize record);

    int insertSelective(Prize record);

    List<Prize> selectByExample(PrizeQuery example);

    Prize selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Prize record, @Param("example") PrizeQuery example);

    int updateByExample(@Param("record") Prize record, @Param("example") PrizeQuery example);

    int updateByPrimaryKeySelective(Prize record);

    int updateByPrimaryKey(Prize record);
}
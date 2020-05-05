package com.cty.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cty.entity.Bill;
import com.cty.entity.BillQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BillDao extends BaseMapper<Bill> {
    int countByExample(BillQuery example);

    int deleteByExample(BillQuery example);

    int insert(Bill record);

    int insertSelective(Bill record);

    List<Bill> selectByExample(BillQuery example);

    int updateByExampleSelective(@Param("record") Bill record, @Param("example") BillQuery example);

    int updateByExample(@Param("record") Bill record, @Param("example") BillQuery example);
}
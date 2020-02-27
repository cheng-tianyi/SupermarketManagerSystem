package com.cty.dao;

import com.cty.entity.Bill;
import com.cty.entity.BillQuery;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface BillDao extends Mapper<Bill> {
    int countByExample(BillQuery example);

    int deleteByExample(BillQuery example);

    int insert(Bill record);

    int insertSelective(Bill record);

    List<Bill> selectByExample(BillQuery example);

    int updateByExampleSelective(@Param("record") Bill record, @Param("example") BillQuery example);

    int updateByExample(@Param("record") Bill record, @Param("example") BillQuery example);
}
package com.cty.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cty.entity.Order;
import com.cty.entity.OrderQuery;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderDao extends BaseMapper<Order> {
    int countByExample(OrderQuery example);

    int deleteByExample(OrderQuery example);

    int deleteByPrimaryKey(Long id);

    int insert(Order record);

    int insertSelective(Order record);

    List<Order> selectByExample(OrderQuery example);

    Order selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Order record, @Param("example") OrderQuery example);

    int updateByExample(@Param("record") Order record, @Param("example") OrderQuery example);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);
}
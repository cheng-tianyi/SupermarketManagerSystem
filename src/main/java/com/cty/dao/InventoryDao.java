package com.cty.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cty.entity.Inventory;
import com.cty.entity.InventoryQuery;
import com.cty.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface InventoryDao extends BaseMapper<Inventory> {
    int countByExample(InventoryQuery example);

    int deleteByExample(InventoryQuery example);

    int deleteByPrimaryKey(Long id);

    int insert(Inventory record);

    int insertSelective(Inventory record);

    List<Inventory> selectByExample(InventoryQuery example);

    Inventory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Inventory record, @Param("example") InventoryQuery example);

    int updateByExample(@Param("record") Inventory record, @Param("example") InventoryQuery example);

    int updateByPrimaryKeySelective(Inventory record);

    int updateByPrimaryKey(Inventory record);
}
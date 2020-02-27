package com.cty.dao;

import com.cty.entity.Address;
import com.cty.entity.AddressQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AddressDao {
    int countByExample(AddressQuery example);

    int deleteByExample(AddressQuery example);

    int insert(Address record);

    int insertSelective(Address record);

    List<Address> selectByExample(AddressQuery example);

    int updateByExampleSelective(@Param("record") Address record, @Param("example") AddressQuery example);

    int updateByExample(@Param("record") Address record, @Param("example") AddressQuery example);
}
package com.cty.dao;

import com.cty.entity.Provider;
import com.cty.entity.ProviderQuery;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface ProviderDao extends Mapper<Provider> {
    int countByExample(ProviderQuery example);

    int deleteByExample(ProviderQuery example);

    int insert(Provider record);

    int insertSelective(Provider record);

    List<Provider> selectByExample(ProviderQuery example);

    int updateByExampleSelective(@Param("record") Provider record, @Param("example") ProviderQuery example);

    int updateByExample(@Param("record") Provider record, @Param("example") ProviderQuery example);
}
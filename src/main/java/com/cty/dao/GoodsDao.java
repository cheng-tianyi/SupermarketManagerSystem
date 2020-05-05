package com.cty.dao;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.cty.entity.Goods;
import com.cty.entity.GoodsQuery;
import com.cty.entity.pojo.GoodsDTO;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsDao extends BaseMapper<Goods> {
    int countByExample(GoodsQuery example);

    int deleteByExample(GoodsQuery example);

    int deleteByPrimaryKey(Long id);

    int insertGoods(Goods record);

    int insertSelective(Goods record);

    List<Goods> selectByExample(GoodsQuery example);

    Goods selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Goods record, @Param("example") GoodsQuery example);

    int updateByExample(@Param("record") Goods record, @Param("example") GoodsQuery example);

    int updateByPrimaryKeySelective(Goods record);

    int updateByPrimaryKey(Goods record);

    IPage<GoodsDTO> selectGoods(IPage page,@Param(Constants.WRAPPER) LambdaQueryWrapper<Goods> goods);
}
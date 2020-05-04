package com.cty.dao;

import com.cty.entity.Goods;
import com.cty.entity.GoodsQuery;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface GoodsDao extends Mapper<Goods> {
    int countByExample(GoodsQuery example);

    int deleteByExample(GoodsQuery example);

    int deleteByPrimaryKey(Long id);

    int insert(Goods record);

    int insertSelective(Goods record);

    List<Goods> selectByExample(GoodsQuery example);

    Goods selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Goods record, @Param("example") GoodsQuery example);

    int updateByExample(@Param("record") Goods record, @Param("example") GoodsQuery example);

    int updateByPrimaryKeySelective(Goods record);

    int updateByPrimaryKey(Goods record);

//    Page<GoodsDTO> selectGoods(Goods goods);
}
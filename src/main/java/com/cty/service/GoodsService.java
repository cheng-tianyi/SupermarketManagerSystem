package com.cty.service;

import com.cty.entity.Goods;
import com.cty.entity.pojo.PageResult;

/**
 * @Author wuyong7
 * @Description
 * @data 2020/5/5 1:31
 */
public interface GoodsService {
    /**
     * 查询物品集合--1分页查询--2连表查询库存数量--3带查询条件查询
     * @param page
     * @param pageSize
     * @param goods
     * @return
     */
    PageResult findPage(Integer page, Integer pageSize, Goods goods);
}

package com.cty.service.impl;

import com.cty.dao.GoodsDao;
import com.cty.dao.InventoryDao;
import com.cty.entity.*;
import com.cty.entity.pojo.GoodsDTO;
import com.cty.entity.pojo.PageResult;
import com.cty.service.GoodsService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author wuyong7
 * @Description
 * @data 2020/5/5 1:31
 */
@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsDao goodsDao;
    @Autowired
    private InventoryDao inventoryDao;
    @Override
    public PageResult findPage(Integer page, Integer pageSize, Goods goods) {
//        PageHelper.startPage(page,pageSize);
        List<Inventory> inventories = inventoryDao.selectByExample(null);
        List<Goods> goods1 = goodsDao.selectByExample(null);
//        Page<GoodsDTO> userList = goodsDao.selectGoods(goods);
//        PageResult result = new PageResult(userList.getTotal(),userList.getResult());
        return null;
    }
}

package com.cty.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.cty.dao.GoodsDao;
import com.cty.dao.InventoryDao;
import com.cty.entity.*;
import com.cty.entity.pojo.GoodsDTO;
import com.cty.entity.pojo.PageResult;
import com.cty.service.GoodsService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @Author wuyong7
 * @Description
 * @data 2020/5/5 1:31
 */
@Service
@Transactional
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsDao goodsDao;

    @Autowired
    private InventoryDao inventoryDao;
    @Override
    public PageResult findPage(Integer page, Integer pageSize, Goods goods) {
        IPage<Map> page1 = new Page<>(page,pageSize);
        QueryWrapper<Goods> wrapper = new QueryWrapper<>();
        if(goods!=null) {
            wrapper.like(StringUtils.isNotEmpty(goods.getGoodName()), "good_name", goods.getGoodName());
            if (StringUtils.isNotEmpty(goods.getProvider())){
                wrapper.eq("provider", Integer.parseInt(goods.getProvider()));
            }

            wrapper.apply("t.id=k.id");
            wrapper.orderByAsc("k.num");
        }
        IPage<GoodsDTO> goodsDTOIPage = goodsDao.selectGoods(page1, wrapper);
        PageResult result = new PageResult(goodsDTOIPage.getTotal(),goodsDTOIPage.getRecords());
        return result;
    }

    @Override
    public void goodsAdd(GoodsDTO goodsDTO) {
        Goods goods = new Goods();
        BeanUtils.copyProperties(goodsDTO,goods);

        goodsDao.insertGoods(goods);
        Inventory inventory = new Inventory();
        inventory.setDate(new Date());
        inventory.setId(goods.getId());
        inventory.setNum(goodsDTO.getNum());
        inventoryDao.insert(inventory);
    }

    @Override
    public void update(GoodsDTO goodsDTO) {
        Goods goods = new Goods();
        BeanUtils.copyProperties(goodsDTO,goods);
        goodsDao.updateByPrimaryKey(goods);
    }

    @Override
    public void deleteGoodsById(Long id) {
        goodsDao.deleteById(id);
        inventoryDao.deleteById(id);
    }

    @Override
    public List<Goods> selectAll() {
        return goodsDao.selectList(null);
    }
}

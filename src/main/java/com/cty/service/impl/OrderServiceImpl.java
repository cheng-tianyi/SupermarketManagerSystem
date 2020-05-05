package com.cty.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.cty.dao.InventoryDao;
import com.cty.dao.OrderDao;
import com.cty.entity.Goods;
import com.cty.entity.Inventory;
import com.cty.entity.Order;
import com.cty.entity.pojo.OrderDTO;
import com.cty.service.OrderService;
import com.cty.utils.MyUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.Date;
import java.util.List;

/**
 * @Author wuyong7
 * @Description
 * @data 2020/5/5 18:12
 */
@Service
@Transactional
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderDao orderDao;
    @Autowired
    private InventoryDao inventoryDao;

    @Override
    public long goodsAdd(OrderDTO orderDTO) {
        String customer = orderDTO.getCustomer();
        String saler = orderDTO.getSaler();
        List<Goods> goodsList = orderDTO.getGoodsList();

        long recordId = MyUtils.getRecordId();
        for (Goods goods : goodsList) {
            Order order = new Order();
            order.setCustomer(customer);
            order.setSaler(saler);
            order.setProductCount(goods.getCount());
            order.setProductName(goods.getGoodName());
            order.setTotalPrice(goods.getTotalPrice());
            order.setCreationDate(new Date());
            order.setRecord(recordId+"");
            Long id = goods.getId();
            Inventory inventory = inventoryDao.selectById(id);
            inventory.setNum(inventory.getNum()-goods.getCount());
            inventory.setDate(new Date());
            LambdaQueryWrapper<Inventory> wrapper = new LambdaQueryWrapper<>();
            wrapper.eq(Inventory::getId,id);
            orderDao.insert(order);
            inventoryDao.update(inventory,wrapper);
        }
        return recordId;
    }
}

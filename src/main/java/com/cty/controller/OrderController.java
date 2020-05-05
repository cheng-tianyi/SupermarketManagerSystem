package com.cty.controller;

import com.cty.entity.User;
import com.cty.entity.pojo.GoodsDTO;
import com.cty.entity.pojo.OrderDTO;
import com.cty.entity.pojo.Result;
import com.cty.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * @Author wuyong7
 * @Description
 * @data 2020/5/5 18:08
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping("save")
    public Result save(@RequestBody OrderDTO orderDTO, HttpSession session){
        try {
            User user = (User) session.getAttribute("user");
            orderDTO.setSaler(user.getUserName());
            long record = orderService.goodsAdd(orderDTO);
            return new Result(true,"交易成功:流水号为"+record);
        }catch (Exception e){
            return new Result(false,"交易失败");
        }
    }
}

package com.cty.entity.pojo;

import com.cty.entity.Goods;
import lombok.Data;

import java.util.List;

/**
 * @Author wuyong7
 * @Description
 * @data 2020/5/5 18:05
 */
@Data
public class OrderDTO {
    private String customer;

    private String saler;

    private List<Goods> goodsList;
}

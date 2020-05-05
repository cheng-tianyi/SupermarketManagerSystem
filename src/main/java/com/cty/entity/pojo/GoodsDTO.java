package com.cty.entity.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * @Author cty
 * @Description
 * @data 2020/5/5 1:56
 */
@Data
public class GoodsDTO implements Serializable {
    /**
     * 主键
     */
    private Long id;

    /**
     * 供货商
     */
    private String provider;

    /**
     * 商品名
     */
    private String goodName;

    /**
     * 条形码
     */
    private String goodCode;

    /**
     * 到期时间
     */
    @JsonFormat(pattern="yyyy-MM-dd")
    private Timestamp expiryDate;

    /**
     * 单位
     */
    private String unit;

    /**
     * 种类
     */
    private String kind;

    /**
     * 产地
     */
    private String place;

    /**
     * 价格
     */
    private BigDecimal price;

    /**
     * 备注
     */
    private String note;

    private Long num;

    private static final long serialVersionUID = 1L;
}

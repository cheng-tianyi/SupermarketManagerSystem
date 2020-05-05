package com.cty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.apache.ibatis.annotations.Options;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
@Data
@TableName("smbms_goods")
public class Goods implements Serializable {
    /**
     * 主键
     */
    @TableId(type = IdType.INPUT)
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
    private Date expiryDate;

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



    private static final long serialVersionUID = 1L;
}
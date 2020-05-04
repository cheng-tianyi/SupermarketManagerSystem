package com.cty.entity.pojo;

import lombok.Data;

import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @Author cty
 * @Description
 * @data 2020/5/5 1:56
 */
@Data
@Table(name="smbms_goods")
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

    private String num;

    private static final long serialVersionUID = 1L;
}

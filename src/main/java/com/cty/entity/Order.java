package com.cty.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Order implements Serializable {
    /**
     * 主键ID
     */
    private Long id;

    /**
     * 流水号
     */
    private String record;

    /**
     * 商品名称
     */
    private String productName;

    /**
     * 商品描述
     */
    private String productDesc;

    /**
     * 商品单位
     */
    private String productUnit;

    /**
     * 商品数量
     */
    private Long productCount;

    /**
     * 商品总额
     */
    private BigDecimal totalPrice;

    /**
     * 是否支付（1：未支付 2：已支付）
     */
    private Integer isPayment;

    /**
     * 销售人
     */
    private String saler;

    /**
     * 创建时间
     */
    private Date creationDate;

    /**
     * 消费者
     */
    private String customer;

    /**
     * 更新时间
     */
    private Date modifyDate;

    /**
     * 供应商ID
     */
    private Long providerId;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRecord() {
        return record;
    }

    public void setRecord(String record) {
        this.record = record == null ? null : record.trim();
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc == null ? null : productDesc.trim();
    }

    public String getProductUnit() {
        return productUnit;
    }

    public void setProductUnit(String productUnit) {
        this.productUnit = productUnit == null ? null : productUnit.trim();
    }

    public Long getProductCount() {
        return productCount;
    }

    public void setProductCount(Long productCount) {
        this.productCount = productCount;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Integer getIsPayment() {
        return isPayment;
    }

    public void setIsPayment(Integer isPayment) {
        this.isPayment = isPayment;
    }

    public String getSaler() {
        return saler;
    }

    public void setSaler(String saler) {
        this.saler = saler == null ? null : saler.trim();
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer == null ? null : customer.trim();
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public Long getProviderId() {
        return providerId;
    }

    public void setProviderId(Long providerId) {
        this.providerId = providerId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", record=").append(record);
        sb.append(", productName=").append(productName);
        sb.append(", productDesc=").append(productDesc);
        sb.append(", productUnit=").append(productUnit);
        sb.append(", productCount=").append(productCount);
        sb.append(", totalPrice=").append(totalPrice);
        sb.append(", isPayment=").append(isPayment);
        sb.append(", saler=").append(saler);
        sb.append(", creationDate=").append(creationDate);
        sb.append(", customer=").append(customer);
        sb.append(", modifyDate=").append(modifyDate);
        sb.append(", providerId=").append(providerId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Order other = (Order) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getRecord() == null ? other.getRecord() == null : this.getRecord().equals(other.getRecord()))
            && (this.getProductName() == null ? other.getProductName() == null : this.getProductName().equals(other.getProductName()))
            && (this.getProductDesc() == null ? other.getProductDesc() == null : this.getProductDesc().equals(other.getProductDesc()))
            && (this.getProductUnit() == null ? other.getProductUnit() == null : this.getProductUnit().equals(other.getProductUnit()))
            && (this.getProductCount() == null ? other.getProductCount() == null : this.getProductCount().equals(other.getProductCount()))
            && (this.getTotalPrice() == null ? other.getTotalPrice() == null : this.getTotalPrice().equals(other.getTotalPrice()))
            && (this.getIsPayment() == null ? other.getIsPayment() == null : this.getIsPayment().equals(other.getIsPayment()))
            && (this.getSaler() == null ? other.getSaler() == null : this.getSaler().equals(other.getSaler()))
            && (this.getCreationDate() == null ? other.getCreationDate() == null : this.getCreationDate().equals(other.getCreationDate()))
            && (this.getCustomer() == null ? other.getCustomer() == null : this.getCustomer().equals(other.getCustomer()))
            && (this.getModifyDate() == null ? other.getModifyDate() == null : this.getModifyDate().equals(other.getModifyDate()))
            && (this.getProviderId() == null ? other.getProviderId() == null : this.getProviderId().equals(other.getProviderId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getRecord() == null) ? 0 : getRecord().hashCode());
        result = prime * result + ((getProductName() == null) ? 0 : getProductName().hashCode());
        result = prime * result + ((getProductDesc() == null) ? 0 : getProductDesc().hashCode());
        result = prime * result + ((getProductUnit() == null) ? 0 : getProductUnit().hashCode());
        result = prime * result + ((getProductCount() == null) ? 0 : getProductCount().hashCode());
        result = prime * result + ((getTotalPrice() == null) ? 0 : getTotalPrice().hashCode());
        result = prime * result + ((getIsPayment() == null) ? 0 : getIsPayment().hashCode());
        result = prime * result + ((getSaler() == null) ? 0 : getSaler().hashCode());
        result = prime * result + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        result = prime * result + ((getCustomer() == null) ? 0 : getCustomer().hashCode());
        result = prime * result + ((getModifyDate() == null) ? 0 : getModifyDate().hashCode());
        result = prime * result + ((getProviderId() == null) ? 0 : getProviderId().hashCode());
        return result;
    }
}
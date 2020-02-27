package com.cty.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
@Table(name="smbms_bill")
public class Bill implements Serializable {
    /**
     * 主键ID
     */
    @Id
    private Long id;

    /**
     * 账单编码
     */
    private String billCode;

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
    private BigDecimal productCount;

    /**
     * 商品总额
     */
    private BigDecimal totalPrice;

    /**
     * 是否支付（1：未支付 2：已支付）
     */
    private Integer isPayment;

    /**
     * 创建者（userId）
     */
    private Long createdBy;

    /**
     * 创建时间
     */
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date creationDate;

    /**
     * 更新者（userId）
     */
    private Long modifyBy;

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

    public String getBillCode() {
        return billCode;
    }

    public void setBillCode(String billCode) {
        this.billCode = billCode == null ? null : billCode.trim();
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

    public BigDecimal getProductCount() {
        return productCount;
    }

    public void setProductCount(BigDecimal productCount) {
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

    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Long getModifyBy() {
        return modifyBy;
    }

    public void setModifyBy(Long modifyBy) {
        this.modifyBy = modifyBy;
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
        sb.append(", billCode=").append(billCode);
        sb.append(", productName=").append(productName);
        sb.append(", productDesc=").append(productDesc);
        sb.append(", productUnit=").append(productUnit);
        sb.append(", productCount=").append(productCount);
        sb.append(", totalPrice=").append(totalPrice);
        sb.append(", isPayment=").append(isPayment);
        sb.append(", createdBy=").append(createdBy);
        sb.append(", creationDate=").append(creationDate);
        sb.append(", modifyBy=").append(modifyBy);
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
        Bill other = (Bill) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getBillCode() == null ? other.getBillCode() == null : this.getBillCode().equals(other.getBillCode()))
            && (this.getProductName() == null ? other.getProductName() == null : this.getProductName().equals(other.getProductName()))
            && (this.getProductDesc() == null ? other.getProductDesc() == null : this.getProductDesc().equals(other.getProductDesc()))
            && (this.getProductUnit() == null ? other.getProductUnit() == null : this.getProductUnit().equals(other.getProductUnit()))
            && (this.getProductCount() == null ? other.getProductCount() == null : this.getProductCount().equals(other.getProductCount()))
            && (this.getTotalPrice() == null ? other.getTotalPrice() == null : this.getTotalPrice().equals(other.getTotalPrice()))
            && (this.getIsPayment() == null ? other.getIsPayment() == null : this.getIsPayment().equals(other.getIsPayment()))
            && (this.getCreatedBy() == null ? other.getCreatedBy() == null : this.getCreatedBy().equals(other.getCreatedBy()))
            && (this.getCreationDate() == null ? other.getCreationDate() == null : this.getCreationDate().equals(other.getCreationDate()))
            && (this.getModifyBy() == null ? other.getModifyBy() == null : this.getModifyBy().equals(other.getModifyBy()))
            && (this.getModifyDate() == null ? other.getModifyDate() == null : this.getModifyDate().equals(other.getModifyDate()))
            && (this.getProviderId() == null ? other.getProviderId() == null : this.getProviderId().equals(other.getProviderId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getBillCode() == null) ? 0 : getBillCode().hashCode());
        result = prime * result + ((getProductName() == null) ? 0 : getProductName().hashCode());
        result = prime * result + ((getProductDesc() == null) ? 0 : getProductDesc().hashCode());
        result = prime * result + ((getProductUnit() == null) ? 0 : getProductUnit().hashCode());
        result = prime * result + ((getProductCount() == null) ? 0 : getProductCount().hashCode());
        result = prime * result + ((getTotalPrice() == null) ? 0 : getTotalPrice().hashCode());
        result = prime * result + ((getIsPayment() == null) ? 0 : getIsPayment().hashCode());
        result = prime * result + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        result = prime * result + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        result = prime * result + ((getModifyBy() == null) ? 0 : getModifyBy().hashCode());
        result = prime * result + ((getModifyDate() == null) ? 0 : getModifyDate().hashCode());
        result = prime * result + ((getProviderId() == null) ? 0 : getProviderId().hashCode());
        return result;
    }
}
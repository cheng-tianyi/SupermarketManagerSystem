package com.cty.entity;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;
@Table(name="smbms_provider")
public class Provider implements Serializable {
    /**
     * 主键ID
     */
    @Id
    private Long id;

    /**
     * 供应商编码
     */
    private String proCode;

    /**
     * 供应商名称
     */
    private String proName;

    /**
     * 供应商详细描述
     */
    private String proDesc;

    /**
     * 供应商联系人
     */
    private String proContact;

    /**
     * 联系电话
     */
    private String proPhone;

    /**
     * 地址
     */
    private String proAddress;

    /**
     * 传真
     */
    private String proFax;

    /**
     * 创建者（userId）
     */
    private Long createdBy;

    /**
     * 创建时间
     */
    private Date creationDate;

    /**
     * 更新时间
     */
    private Date modifydate;

    /**
     * 更新者（userId）
     */
    private Long modifyby;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProCode() {
        return proCode;
    }

    public void setProCode(String proCode) {
        this.proCode = proCode == null ? null : proCode.trim();
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName == null ? null : proName.trim();
    }

    public String getProDesc() {
        return proDesc;
    }

    public void setProDesc(String proDesc) {
        this.proDesc = proDesc == null ? null : proDesc.trim();
    }

    public String getProContact() {
        return proContact;
    }

    public void setProContact(String proContact) {
        this.proContact = proContact == null ? null : proContact.trim();
    }

    public String getProPhone() {
        return proPhone;
    }

    public void setProPhone(String proPhone) {
        this.proPhone = proPhone == null ? null : proPhone.trim();
    }

    public String getProAddress() {
        return proAddress;
    }

    public void setProAddress(String proAddress) {
        this.proAddress = proAddress == null ? null : proAddress.trim();
    }

    public String getProFax() {
        return proFax;
    }

    public void setProFax(String proFax) {
        this.proFax = proFax == null ? null : proFax.trim();
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

    public Date getModifydate() {
        return modifydate;
    }

    public void setModifydate(Date modifydate) {
        this.modifydate = modifydate;
    }

    public Long getModifyby() {
        return modifyby;
    }

    public void setModifyby(Long modifyby) {
        this.modifyby = modifyby;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", proCode=").append(proCode);
        sb.append(", proName=").append(proName);
        sb.append(", proDesc=").append(proDesc);
        sb.append(", proContact=").append(proContact);
        sb.append(", proPhone=").append(proPhone);
        sb.append(", proAddress=").append(proAddress);
        sb.append(", proFax=").append(proFax);
        sb.append(", createdBy=").append(createdBy);
        sb.append(", creationDate=").append(creationDate);
        sb.append(", modifydate=").append(modifydate);
        sb.append(", modifyby=").append(modifyby);
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
        Provider other = (Provider) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getProCode() == null ? other.getProCode() == null : this.getProCode().equals(other.getProCode()))
            && (this.getProName() == null ? other.getProName() == null : this.getProName().equals(other.getProName()))
            && (this.getProDesc() == null ? other.getProDesc() == null : this.getProDesc().equals(other.getProDesc()))
            && (this.getProContact() == null ? other.getProContact() == null : this.getProContact().equals(other.getProContact()))
            && (this.getProPhone() == null ? other.getProPhone() == null : this.getProPhone().equals(other.getProPhone()))
            && (this.getProAddress() == null ? other.getProAddress() == null : this.getProAddress().equals(other.getProAddress()))
            && (this.getProFax() == null ? other.getProFax() == null : this.getProFax().equals(other.getProFax()))
            && (this.getCreatedBy() == null ? other.getCreatedBy() == null : this.getCreatedBy().equals(other.getCreatedBy()))
            && (this.getCreationDate() == null ? other.getCreationDate() == null : this.getCreationDate().equals(other.getCreationDate()))
            && (this.getModifydate() == null ? other.getModifydate() == null : this.getModifydate().equals(other.getModifydate()))
            && (this.getModifyby() == null ? other.getModifyby() == null : this.getModifyby().equals(other.getModifyby()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getProCode() == null) ? 0 : getProCode().hashCode());
        result = prime * result + ((getProName() == null) ? 0 : getProName().hashCode());
        result = prime * result + ((getProDesc() == null) ? 0 : getProDesc().hashCode());
        result = prime * result + ((getProContact() == null) ? 0 : getProContact().hashCode());
        result = prime * result + ((getProPhone() == null) ? 0 : getProPhone().hashCode());
        result = prime * result + ((getProAddress() == null) ? 0 : getProAddress().hashCode());
        result = prime * result + ((getProFax() == null) ? 0 : getProFax().hashCode());
        result = prime * result + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        result = prime * result + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        result = prime * result + ((getModifydate() == null) ? 0 : getModifydate().hashCode());
        result = prime * result + ((getModifyby() == null) ? 0 : getModifyby().hashCode());
        return result;
    }
}
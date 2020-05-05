package com.cty.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
@TableName("smbms_address")
public class Address implements Serializable {
    /**
     * 主键ID
     */
    @TableId
    private Long id;

    /**
     * 联系人姓名
     */
    private String contact;

    /**
     * 收货地址明细
     */
    private String addressdesc;

    /**
     * 邮编
     */
    private String postcode;

    /**
     * 联系人电话
     */
    private String tel;

    /**
     * 创建者
     */
    private Long createdby;

    /**
     * 创建时间
     */
    private Date creationdate;

    /**
     * 修改者
     */
    private Long modifyby;

    /**
     * 修改时间
     */
    private Date modifydate;

    /**
     * 用户ID
     */
    private Long userid;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact == null ? null : contact.trim();
    }

    public String getAddressdesc() {
        return addressdesc;
    }

    public void setAddressdesc(String addressdesc) {
        this.addressdesc = addressdesc == null ? null : addressdesc.trim();
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode == null ? null : postcode.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public Long getCreatedby() {
        return createdby;
    }

    public void setCreatedby(Long createdby) {
        this.createdby = createdby;
    }

    public Date getCreationdate() {
        return creationdate;
    }

    public void setCreationdate(Date creationdate) {
        this.creationdate = creationdate;
    }

    public Long getModifyby() {
        return modifyby;
    }

    public void setModifyby(Long modifyby) {
        this.modifyby = modifyby;
    }

    public Date getModifydate() {
        return modifydate;
    }

    public void setModifydate(Date modifydate) {
        this.modifydate = modifydate;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", contact=").append(contact);
        sb.append(", addressdesc=").append(addressdesc);
        sb.append(", postcode=").append(postcode);
        sb.append(", tel=").append(tel);
        sb.append(", createdby=").append(createdby);
        sb.append(", creationdate=").append(creationdate);
        sb.append(", modifyby=").append(modifyby);
        sb.append(", modifydate=").append(modifydate);
        sb.append(", userid=").append(userid);
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
        Address other = (Address) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getContact() == null ? other.getContact() == null : this.getContact().equals(other.getContact()))
            && (this.getAddressdesc() == null ? other.getAddressdesc() == null : this.getAddressdesc().equals(other.getAddressdesc()))
            && (this.getPostcode() == null ? other.getPostcode() == null : this.getPostcode().equals(other.getPostcode()))
            && (this.getTel() == null ? other.getTel() == null : this.getTel().equals(other.getTel()))
            && (this.getCreatedby() == null ? other.getCreatedby() == null : this.getCreatedby().equals(other.getCreatedby()))
            && (this.getCreationdate() == null ? other.getCreationdate() == null : this.getCreationdate().equals(other.getCreationdate()))
            && (this.getModifyby() == null ? other.getModifyby() == null : this.getModifyby().equals(other.getModifyby()))
            && (this.getModifydate() == null ? other.getModifydate() == null : this.getModifydate().equals(other.getModifydate()))
            && (this.getUserid() == null ? other.getUserid() == null : this.getUserid().equals(other.getUserid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getContact() == null) ? 0 : getContact().hashCode());
        result = prime * result + ((getAddressdesc() == null) ? 0 : getAddressdesc().hashCode());
        result = prime * result + ((getPostcode() == null) ? 0 : getPostcode().hashCode());
        result = prime * result + ((getTel() == null) ? 0 : getTel().hashCode());
        result = prime * result + ((getCreatedby() == null) ? 0 : getCreatedby().hashCode());
        result = prime * result + ((getCreationdate() == null) ? 0 : getCreationdate().hashCode());
        result = prime * result + ((getModifyby() == null) ? 0 : getModifyby().hashCode());
        result = prime * result + ((getModifydate() == null) ? 0 : getModifydate().hashCode());
        result = prime * result + ((getUserid() == null) ? 0 : getUserid().hashCode());
        return result;
    }
}
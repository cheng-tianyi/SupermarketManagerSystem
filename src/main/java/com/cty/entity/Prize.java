package com.cty.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
@TableName("smbms_prize")
public class Prize implements Serializable {
    @TableId
    private Long id;

    /**
     * 兑换商品
     */
    private String good;

    /**
     * 积分
     */
    private Long point;

    /**
     * 会员编号
     */
    private String memberCode;

    /**
     * 会员姓名
     */
    private String memberName;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGood() {
        return good;
    }

    public void setGood(String good) {
        this.good = good == null ? null : good.trim();
    }

    public Long getPoint() {
        return point;
    }

    public void setPoint(Long point) {
        this.point = point;
    }

    public String getMemberCode() {
        return memberCode;
    }

    public void setMemberCode(String memberCode) {
        this.memberCode = memberCode == null ? null : memberCode.trim();
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName == null ? null : memberName.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", good=").append(good);
        sb.append(", point=").append(point);
        sb.append(", memberCode=").append(memberCode);
        sb.append(", memberName=").append(memberName);
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
        Prize other = (Prize) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getGood() == null ? other.getGood() == null : this.getGood().equals(other.getGood()))
            && (this.getPoint() == null ? other.getPoint() == null : this.getPoint().equals(other.getPoint()))
            && (this.getMemberCode() == null ? other.getMemberCode() == null : this.getMemberCode().equals(other.getMemberCode()))
            && (this.getMemberName() == null ? other.getMemberName() == null : this.getMemberName().equals(other.getMemberName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getGood() == null) ? 0 : getGood().hashCode());
        result = prime * result + ((getPoint() == null) ? 0 : getPoint().hashCode());
        result = prime * result + ((getMemberCode() == null) ? 0 : getMemberCode().hashCode());
        result = prime * result + ((getMemberName() == null) ? 0 : getMemberName().hashCode());
        return result;
    }
}
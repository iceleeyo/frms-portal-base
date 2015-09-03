package cn.com.bsfit.frms.portal.base.pojo;

import java.io.Serializable;
import java.util.Date;

public class Dept implements Serializable {
    private String deptId;// 机构ID

    private String deptName;// 机构名称

    private Short deptLevel;// 机构层级

    private String superDeptId;// 上级机构id

    private Short distributeLevel;// 派发层级

    private Short reviewLevel;// 审核层级

    private String picName;// 负责人姓名 person in charge

    private String contact;// 联系方式

    private String deptDiscription;// 机构描述

    private Date createTime;// 创建时间

    private Date updateTime;// 最后更新时间

    private String updateUser;// 更新者

    private static final long serialVersionUID = 1L;

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId == null ? null : deptId.trim();
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }

    public Short getDeptLevel() {
        return deptLevel;
    }

    public void setDeptLevel(Short deptLevel) {
        this.deptLevel = deptLevel;
    }

    public String getSuperDeptId() {
        return superDeptId;
    }

    public void setSuperDeptId(String superDeptId) {
        this.superDeptId = superDeptId == null ? null : superDeptId.trim();
    }

    public Short getDistributeLevel() {
        return distributeLevel;
    }

    public void setDistributeLevel(Short distributeLevel) {
        this.distributeLevel = distributeLevel;
    }

    public Short getReviewLevel() {
        return reviewLevel;
    }

    public void setReviewLevel(Short reviewLevel) {
        this.reviewLevel = reviewLevel;
    }

    public String getPicName() {
        return picName;
    }

    public void setPicName(String picName) {
        this.picName = picName == null ? null : picName.trim();
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact == null ? null : contact.trim();
    }

    public String getDeptDiscription() {
        return deptDiscription;
    }

    public void setDeptDiscription(String deptDiscription) {
        this.deptDiscription = deptDiscription == null ? null : deptDiscription.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
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
        Dept other = (Dept) that;
        return (this.getDeptId() == null ? other.getDeptId() == null : this.getDeptId().equals(other.getDeptId()))
            && (this.getDeptName() == null ? other.getDeptName() == null : this.getDeptName().equals(other.getDeptName()))
            && (this.getDeptLevel() == null ? other.getDeptLevel() == null : this.getDeptLevel().equals(other.getDeptLevel()))
            && (this.getSuperDeptId() == null ? other.getSuperDeptId() == null : this.getSuperDeptId().equals(other.getSuperDeptId()))
            && (this.getDistributeLevel() == null ? other.getDistributeLevel() == null : this.getDistributeLevel().equals(other.getDistributeLevel()))
            && (this.getReviewLevel() == null ? other.getReviewLevel() == null : this.getReviewLevel().equals(other.getReviewLevel()))
            && (this.getPicName() == null ? other.getPicName() == null : this.getPicName().equals(other.getPicName()))
            && (this.getContact() == null ? other.getContact() == null : this.getContact().equals(other.getContact()))
            && (this.getDeptDiscription() == null ? other.getDeptDiscription() == null : this.getDeptDiscription().equals(other.getDeptDiscription()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getUpdateUser() == null ? other.getUpdateUser() == null : this.getUpdateUser().equals(other.getUpdateUser()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDeptId() == null) ? 0 : getDeptId().hashCode());
        result = prime * result + ((getDeptName() == null) ? 0 : getDeptName().hashCode());
        result = prime * result + ((getDeptLevel() == null) ? 0 : getDeptLevel().hashCode());
        result = prime * result + ((getSuperDeptId() == null) ? 0 : getSuperDeptId().hashCode());
        result = prime * result + ((getDistributeLevel() == null) ? 0 : getDistributeLevel().hashCode());
        result = prime * result + ((getReviewLevel() == null) ? 0 : getReviewLevel().hashCode());
        result = prime * result + ((getPicName() == null) ? 0 : getPicName().hashCode());
        result = prime * result + ((getContact() == null) ? 0 : getContact().hashCode());
        result = prime * result + ((getDeptDiscription() == null) ? 0 : getDeptDiscription().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getUpdateUser() == null) ? 0 : getUpdateUser().hashCode());
        return result;
    }
}
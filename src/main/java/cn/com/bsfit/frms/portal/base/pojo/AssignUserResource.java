package cn.com.bsfit.frms.portal.base.pojo;

import java.io.Serializable;

public class AssignUserResource implements Serializable {
    private Long id;

    private Long assignId;

    private Integer deptId;

    private String bizCode;

    private Integer riskLevel;

    private String bizCategory;

    private String riskType;

    private String param1;

    private String param2;

    private String param3;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAssignId() {
        return assignId;
    }

    public void setAssignId(Long assignId) {
        this.assignId = assignId;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getBizCode() {
        return bizCode;
    }

    public void setBizCode(String bizCode) {
        this.bizCode = bizCode == null ? null : bizCode.trim();
    }

    public Integer getRiskLevel() {
        return riskLevel;
    }

    public void setRiskLevel(Integer riskLevel) {
        this.riskLevel = riskLevel;
    }

    public String getBizCategory() {
        return bizCategory;
    }

    public void setBizCategory(String bizCategory) {
        this.bizCategory = bizCategory == null ? null : bizCategory.trim();
    }

    public String getRiskType() {
        return riskType;
    }

    public void setRiskType(String riskType) {
        this.riskType = riskType == null ? null : riskType.trim();
    }

    public String getParam1() {
        return param1;
    }

    public void setParam1(String param1) {
        this.param1 = param1 == null ? null : param1.trim();
    }

    public String getParam2() {
        return param2;
    }

    public void setParam2(String param2) {
        this.param2 = param2 == null ? null : param2.trim();
    }

    public String getParam3() {
        return param3;
    }

    public void setParam3(String param3) {
        this.param3 = param3 == null ? null : param3.trim();
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
        AssignUserResource other = (AssignUserResource) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAssignId() == null ? other.getAssignId() == null : this.getAssignId().equals(other.getAssignId()))
            && (this.getDeptId() == null ? other.getDeptId() == null : this.getDeptId().equals(other.getDeptId()))
            && (this.getBizCode() == null ? other.getBizCode() == null : this.getBizCode().equals(other.getBizCode()))
            && (this.getRiskLevel() == null ? other.getRiskLevel() == null : this.getRiskLevel().equals(other.getRiskLevel()))
            && (this.getBizCategory() == null ? other.getBizCategory() == null : this.getBizCategory().equals(other.getBizCategory()))
            && (this.getRiskType() == null ? other.getRiskType() == null : this.getRiskType().equals(other.getRiskType()))
            && (this.getParam1() == null ? other.getParam1() == null : this.getParam1().equals(other.getParam1()))
            && (this.getParam2() == null ? other.getParam2() == null : this.getParam2().equals(other.getParam2()))
            && (this.getParam3() == null ? other.getParam3() == null : this.getParam3().equals(other.getParam3()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAssignId() == null) ? 0 : getAssignId().hashCode());
        result = prime * result + ((getDeptId() == null) ? 0 : getDeptId().hashCode());
        result = prime * result + ((getBizCode() == null) ? 0 : getBizCode().hashCode());
        result = prime * result + ((getRiskLevel() == null) ? 0 : getRiskLevel().hashCode());
        result = prime * result + ((getBizCategory() == null) ? 0 : getBizCategory().hashCode());
        result = prime * result + ((getRiskType() == null) ? 0 : getRiskType().hashCode());
        result = prime * result + ((getParam1() == null) ? 0 : getParam1().hashCode());
        result = prime * result + ((getParam2() == null) ? 0 : getParam2().hashCode());
        result = prime * result + ((getParam3() == null) ? 0 : getParam3().hashCode());
        return result;
    }
}
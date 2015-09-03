package cn.com.bsfit.frms.portal.base.pojo;

import java.io.Serializable;
import java.util.Date;

public class CountriesCode implements Serializable {
    private Long id;// 主键

    private String letterCode;// 字母编码

    private String digitalCode;// 数字编码

    private String forShort;// 国家简称

    private String fullName;// 国家全称

    private Date createTime;// 创建时间

    private Date updateTime;// 更新时间

    private String modifer;// 更新者

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLetterCode() {
        return letterCode;
    }

    public void setLetterCode(String letterCode) {
        this.letterCode = letterCode == null ? null : letterCode.trim();
    }

    public String getDigitalCode() {
        return digitalCode;
    }

    public void setDigitalCode(String digitalCode) {
        this.digitalCode = digitalCode == null ? null : digitalCode.trim();
    }

    public String getForShort() {
        return forShort;
    }

    public void setForShort(String forShort) {
        this.forShort = forShort == null ? null : forShort.trim();
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName == null ? null : fullName.trim();
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

    public String getModifer() {
        return modifer;
    }

    public void setModifer(String modifer) {
        this.modifer = modifer == null ? null : modifer.trim();
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
        CountriesCode other = (CountriesCode) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getLetterCode() == null ? other.getLetterCode() == null : this.getLetterCode().equals(other.getLetterCode()))
            && (this.getDigitalCode() == null ? other.getDigitalCode() == null : this.getDigitalCode().equals(other.getDigitalCode()))
            && (this.getForShort() == null ? other.getForShort() == null : this.getForShort().equals(other.getForShort()))
            && (this.getFullName() == null ? other.getFullName() == null : this.getFullName().equals(other.getFullName()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getModifer() == null ? other.getModifer() == null : this.getModifer().equals(other.getModifer()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getLetterCode() == null) ? 0 : getLetterCode().hashCode());
        result = prime * result + ((getDigitalCode() == null) ? 0 : getDigitalCode().hashCode());
        result = prime * result + ((getForShort() == null) ? 0 : getForShort().hashCode());
        result = prime * result + ((getFullName() == null) ? 0 : getFullName().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getModifer() == null) ? 0 : getModifer().hashCode());
        return result;
    }

	@Override
	public String toString() {
		return "CountriesCode [id=" + id + ", letterCode=" + letterCode + ", digitalCode=" + digitalCode + ", forShort="
				+ forShort + ", fullName=" + fullName + ", createTime=" + createTime + ", updateTime=" + updateTime
				+ ", modifer=" + modifer + "]";
	}
}
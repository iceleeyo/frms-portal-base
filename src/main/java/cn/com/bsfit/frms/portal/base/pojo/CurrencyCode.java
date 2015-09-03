package cn.com.bsfit.frms.portal.base.pojo;

import java.io.Serializable;
import java.util.Date;

public class CurrencyCode implements Serializable {
    private Long id;// 主键

    private String letterCode;// 字母编码

    private String digitalCode;// 数字编码

    private String name;// 货币名称

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
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
        CurrencyCode other = (CurrencyCode) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getLetterCode() == null ? other.getLetterCode() == null : this.getLetterCode().equals(other.getLetterCode()))
            && (this.getDigitalCode() == null ? other.getDigitalCode() == null : this.getDigitalCode().equals(other.getDigitalCode()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
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
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getModifer() == null) ? 0 : getModifer().hashCode());
        return result;
    }

	@Override
	public String toString() {
		return "CurrencyCode [id=" + id + ", letterCode=" + letterCode + ", digitalCode=" + digitalCode + ", name="
				+ name + ", createTime=" + createTime + ", updateTime=" + updateTime + ", modifer=" + modifer + "]";
	}
}
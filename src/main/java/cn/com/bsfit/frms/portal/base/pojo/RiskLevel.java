package cn.com.bsfit.frms.portal.base.pojo;

import java.io.Serializable;
import java.util.Date;

public class RiskLevel implements Serializable {
    private Integer id;// 风险等级主键,自动递增

    private Long levelVal;// 风险级别值

    private String name;// 风险级别名称

    private Short readonly;// 是否只读:1只读

    private Integer levelMin;// 最小风险值

    private Integer levelMax;// 最大风险值

    private Short enabled;// 状态:0删除,1正常,2禁用

    private Date createTime;// 创建时间

    private Date updateTime;// 最后更新时间

    private String modifer;// 更新者

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getLevelVal() {
        return levelVal;
    }

    public void setLevelVal(Long levelVal) {
        this.levelVal = levelVal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Short getReadonly() {
        return readonly;
    }

    public void setReadonly(Short readonly) {
        this.readonly = readonly;
    }

    public Integer getLevelMin() {
        return levelMin;
    }

    public void setLevelMin(Integer levelMin) {
        this.levelMin = levelMin;
    }

    public Integer getLevelMax() {
        return levelMax;
    }

    public void setLevelMax(Integer levelMax) {
        this.levelMax = levelMax;
    }

    public Short getEnabled() {
        return enabled;
    }

    public void setEnabled(Short enabled) {
        this.enabled = enabled;
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
        RiskLevel other = (RiskLevel) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getLevelVal() == null ? other.getLevelVal() == null : this.getLevelVal().equals(other.getLevelVal()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getReadonly() == null ? other.getReadonly() == null : this.getReadonly().equals(other.getReadonly()))
            && (this.getLevelMin() == null ? other.getLevelMin() == null : this.getLevelMin().equals(other.getLevelMin()))
            && (this.getLevelMax() == null ? other.getLevelMax() == null : this.getLevelMax().equals(other.getLevelMax()))
            && (this.getEnabled() == null ? other.getEnabled() == null : this.getEnabled().equals(other.getEnabled()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getModifer() == null ? other.getModifer() == null : this.getModifer().equals(other.getModifer()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getLevelVal() == null) ? 0 : getLevelVal().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getReadonly() == null) ? 0 : getReadonly().hashCode());
        result = prime * result + ((getLevelMin() == null) ? 0 : getLevelMin().hashCode());
        result = prime * result + ((getLevelMax() == null) ? 0 : getLevelMax().hashCode());
        result = prime * result + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getModifer() == null) ? 0 : getModifer().hashCode());
        return result;
    }

	@Override
	public String toString() {
		return "RiskLevel [id=" + id + ", levelVal=" + levelVal + ", name=" + name + ", readonly=" + readonly
				+ ", levelMin=" + levelMin + ", levelMax=" + levelMax + ", enabled=" + enabled + ", createTime="
				+ createTime + ", updateTime=" + updateTime + ", modifer=" + modifer + "]";
	}
}
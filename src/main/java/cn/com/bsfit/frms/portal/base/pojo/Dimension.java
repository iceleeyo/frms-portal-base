package cn.com.bsfit.frms.portal.base.pojo;

import java.io.Serializable;
import java.util.Date;

public class Dimension implements Serializable {
    private Integer id;// 维度ID,主键自动递增

    private String name;// 名称

    private Short readonly;// 是否只读:1只读

    private String memo;// 备注

    private Integer type;// 是否是递归因子:0:否,1是

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

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
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
        Dimension other = (Dimension) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getReadonly() == null ? other.getReadonly() == null : this.getReadonly().equals(other.getReadonly()))
            && (this.getMemo() == null ? other.getMemo() == null : this.getMemo().equals(other.getMemo()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
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
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getReadonly() == null) ? 0 : getReadonly().hashCode());
        result = prime * result + ((getMemo() == null) ? 0 : getMemo().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getModifer() == null) ? 0 : getModifer().hashCode());
        return result;
    }

	@Override
	public String toString() {
		return "Dimension [id=" + id + ", name=" + name + ", readonly=" + readonly + ", memo=" + memo + ", type=" + type
				+ ", enabled=" + enabled + ", createTime=" + createTime + ", updateTime=" + updateTime + ", modifer="
				+ modifer + "]";
	}
}
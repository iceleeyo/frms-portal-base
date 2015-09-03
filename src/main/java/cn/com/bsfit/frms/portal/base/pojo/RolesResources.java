package cn.com.bsfit.frms.portal.base.pojo;

import java.io.Serializable;

public class RolesResources implements Serializable {
    private Integer id;// 主键

    private Integer rolesId;// 角色表的外键,角色ID

    private Integer resourcesId;// 资源表的外键,资源ID

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRolesId() {
        return rolesId;
    }

    public void setRolesId(Integer rolesId) {
        this.rolesId = rolesId;
    }

    public Integer getResourcesId() {
        return resourcesId;
    }

    public void setResourcesId(Integer resourcesId) {
        this.resourcesId = resourcesId;
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
        RolesResources other = (RolesResources) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getRolesId() == null ? other.getRolesId() == null : this.getRolesId().equals(other.getRolesId()))
            && (this.getResourcesId() == null ? other.getResourcesId() == null : this.getResourcesId().equals(other.getResourcesId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getRolesId() == null) ? 0 : getRolesId().hashCode());
        result = prime * result + ((getResourcesId() == null) ? 0 : getResourcesId().hashCode());
        return result;
    }

	@Override
	public String toString() {
		return "RolesResources [id=" + id + ", rolesId=" + rolesId + ", resourcesId=" + resourcesId + "]";
	}
}
package cn.com.bsfit.frms.portal.base.pojo;

import java.io.Serializable;

public class UsersRoles implements Serializable {
    private Integer id;// 主键

    private Integer usersId;// 用户表的外键,用户ID

    private Integer rolesId;// 角色表的外键,角色ID

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUsersId() {
        return usersId;
    }

    public void setUsersId(Integer usersId) {
        this.usersId = usersId;
    }

    public Integer getRolesId() {
        return rolesId;
    }

    public void setRolesId(Integer rolesId) {
        this.rolesId = rolesId;
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
        UsersRoles other = (UsersRoles) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUsersId() == null ? other.getUsersId() == null : this.getUsersId().equals(other.getUsersId()))
            && (this.getRolesId() == null ? other.getRolesId() == null : this.getRolesId().equals(other.getRolesId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUsersId() == null) ? 0 : getUsersId().hashCode());
        result = prime * result + ((getRolesId() == null) ? 0 : getRolesId().hashCode());
        return result;
    }

	@Override
	public String toString() {
		return "UsersRoles [id=" + id + ", usersId=" + usersId + ", rolesId=" + rolesId + "]";
	}
}
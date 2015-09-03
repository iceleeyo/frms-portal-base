package cn.com.bsfit.frms.portal.base.pojo;

import java.io.Serializable;

/**
 * 用户POJO包含角色名
 * 
 * @author hjp
 * 
 * @since 1.0.0
 *
 */
public class UsersDetail extends Users implements Serializable {

	private static final long serialVersionUID = 1L;
	private String roleNames;// 角色名：多个以逗号分割
	
	public String getRoleNames() {
		return roleNames;
	}
	public void setRoleNames(String roleNames) {
		this.roleNames = roleNames;
	}
}
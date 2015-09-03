package cn.com.bsfit.frms.portal.base.util;

import java.util.List;
import java.util.Map;

import cn.com.bsfit.frms.portal.base.pojo.Users;

/**
 * 受理人员使用 其他模块取List或Map
 * 
 * @author hjp
 * 
 * @since 1.0.0
 *
 */
public class UsersUtil {
	
	private static UsersUtil instance;
	private List<Users> usersList;
	private Map<String, Object> usersMap;
	
	private UsersUtil() {
		
	}
	
	public static synchronized UsersUtil getInstance() {
		if (instance == null) {
			instance = new UsersUtil();
		}
		return instance;
	}
	/****************************************************************/
	public List<Users> getUsersList() {
		return usersList;
	}
	public void setUsersList(List<Users> usersList) {
		this.usersList = usersList;
	}
	public Map<String, Object> getUsersMap() {
		return usersMap;
	}
	public void setUsersMap(Map<String, Object> usersMap) {
		this.usersMap = usersMap;
	}
}
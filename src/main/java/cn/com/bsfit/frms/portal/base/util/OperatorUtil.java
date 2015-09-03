package cn.com.bsfit.frms.portal.base.util;

import java.util.List;
import java.util.Map;

import cn.com.bsfit.frms.portal.base.pojo.Users;

/**
 * 操作人员 其他模块取List或Map
 * 
 * @author hjp
 * 
 * @since 1.0.0
 *
 */
public class OperatorUtil {
	
	private static OperatorUtil instance;
	private List<Users> operatorList;
	private Map<String, Object> operatorMap;
	
	private OperatorUtil() {
		
	}
	
	public static synchronized OperatorUtil getInstance() {
		if (instance == null) {
			instance = new OperatorUtil();
		}
		return instance;
	}
	/****************************************************************/
	public List<Users> getOperatorList() {
		return operatorList;
	}

	public void setOperatorList(List<Users> operatorList) {
		this.operatorList = operatorList;
	}

	public Map<String, Object> getOperatorMap() {
		return operatorMap;
	}

	public void setOperatorMap(Map<String, Object> operatorMap) {
		this.operatorMap = operatorMap;
	}
}
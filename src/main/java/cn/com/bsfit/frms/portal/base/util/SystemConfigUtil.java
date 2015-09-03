package cn.com.bsfit.frms.portal.base.util;

import java.util.List;
import java.util.Map;
import cn.com.bsfit.frms.portal.base.pojo.SystemConfig;

/**
 * 系统配置使用 其他模块取List或Map
 * 
 * @author hjp
 * 
 * @since 1.0.0
 *
 */
public class SystemConfigUtil {

	private static SystemConfigUtil instance;
	private List<SystemConfig> systemConfigList;
	private Map<String, Object> sysConfigMap;

	private SystemConfigUtil() {

	}

	public static synchronized SystemConfigUtil getInstance() {
		if (instance == null) {
			instance = new SystemConfigUtil();
		}
		return instance;
	}

	/****************************************************************/
	public List<SystemConfig> getSystemConfigList() {
		return systemConfigList;
	}

	public void setSystemConfigList(List<SystemConfig> systemConfigList) {
		this.systemConfigList = systemConfigList;
	}

	public Map<String, Object> getSysConfigMap() {
		return sysConfigMap;
	}

	public void setSysConfigMap(Map<String, Object> sysConfigMap) {
		this.sysConfigMap = sysConfigMap;
	}
}
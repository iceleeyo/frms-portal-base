package cn.com.bsfit.frms.portal.base.util;

import java.util.List;
import java.util.Map;

import cn.com.bsfit.frms.portal.base.pojo.RiskLevel;

/**
 * 风险等级使用 其他模块取List或Map
 * 
 * @author hjp
 * 
 * @since 1.0.0
 *
 */
public class RiskLevelUtil {

	private static RiskLevelUtil instance;
	private List<RiskLevel> riskLevelList;
	private Map<String, Object> riskLvelMap;
	
	private RiskLevelUtil() {
		
	}
	
	public static synchronized RiskLevelUtil getInstance() {
		if (instance == null) {
			instance = new RiskLevelUtil();
		}
		return instance;
	}
	
	/****************************************************************/
	public List<RiskLevel> getRiskLevelList() {
		return riskLevelList;
	}

	public void setRiskLevelList(List<RiskLevel> riskLevelList) {
		this.riskLevelList = riskLevelList;
	}
	
	public Map<String, Object> getRiskLvelMap() {
		return riskLvelMap;
	}
	
	public void setRiskLvelMap(Map<String, Object> riskLvelMap) {
		this.riskLvelMap = riskLvelMap;
	}
}
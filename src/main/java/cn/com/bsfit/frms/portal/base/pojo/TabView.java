package cn.com.bsfit.frms.portal.base.pojo;

import java.io.Serializable;
import java.util.HashMap;

/**
 * 页面配置
 * 
 * @author hjp
 * 
 * @since 1.0.0
 *
 */
public class TabView extends HashMap<String, Object>implements Serializable {

	private static final long serialVersionUID = 5803131567264243002L;
	private String xtype = "xtype";
	private String paramSensitive = "paramSensitive";
	private String navParam = "navParam";
	private String controllerName = "controllerName";
	private String openType = "0";

	/**
	 * 配置view在导航栏点击打开或地址栏URL打开事件等相关属性
	 * 
	 * @param controllerName
	 *            要打开的view实例化时需要加载的controller
	 * @param xtype
	 *            要打开的view的别名
	 * @param paramSensitive
	 *            要打开的view是否对url参数敏感,比如如果设为参数敏感,myview?id=1和myview?id=2将导致打开两个页面
	 *            <br>
	 *            true代表参数敏感
	 * @param navParam
	 *            view是否能通过导航栏点击打开<br>
	 *            true代表可以通过导航栏点击
	 */
	public TabView(String controllerName, String xtype, Boolean paramSensitive, Boolean navParam) {
		setControllerName(controllerName);
		setXtype(xtype);
		setParamSensitive(paramSensitive);
		setNavParam(navParam);
	}

	/**
	 * 配置view在导航栏点击打开或地址栏URL打开事件等相关属性
	 * 
	 * @param controllerName
	 *            要打开的view实例化时需要加载的controller
	 * @param xtype
	 *            要打开的view的别名
	 * @param paramSensitive
	 *            要打开的view是否对url参数敏感,比如如果设为参数敏感,myview?id=1和myview?id=2将导致打开两个页面
	 *            <br>
	 *            true代表参数敏感
	 * @param navParam
	 *            view是否能通过导航栏点击打开<br>
	 *            true代表可以通过导航栏点击
	 * @param openType 打开方式
	 * 			  1代表新窗口打开,0代表原窗口打开
	 */
	public TabView(String controllerName, String xtype, Boolean paramSensitive, Boolean navParam, Boolean openType) {
		setControllerName(controllerName);
		setXtype(xtype);
		setParamSensitive(paramSensitive);
		setNavParam(navParam);
	}

	public String getControllerName() {
		return String.valueOf(get(this.controllerName));
	}

	public void setControllerName(String controllerName) {
		put(this.controllerName, controllerName);
	}

	public String getXtype() {
		return String.valueOf(get(this.xtype));
	}

	public void setXtype(String xtype) {
		put(this.xtype, xtype);
	}

	public boolean getParamSensitive() {
		return Boolean.parseBoolean((String) get(this.paramSensitive));
	}

	public void setParamSensitive(Boolean paramSensitive) {
		put(this.paramSensitive, paramSensitive);
	}

	public boolean getNavParam() {
		return Boolean.parseBoolean((String) get(this.navParam));
	}

	public void setNavParam(Boolean navParam) {
		put(this.navParam, navParam);
	}

	public String getOpenType() {
		return String.valueOf(get(this.openType));
	}

	public void setOpenType(String openType) {
		put(this.openType, openType);
	}
}
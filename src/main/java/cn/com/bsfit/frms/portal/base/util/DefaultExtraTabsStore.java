package cn.com.bsfit.frms.portal.base.util;

import java.util.List;

import cn.com.bsfit.frms.portal.base.pojo.TabView;

public interface DefaultExtraTabsStore {
	
	/**
	 * 各模块需要用到的tab列表
	 * 
	 * @return
	 */
	public List<TabView> getTabViews();
}
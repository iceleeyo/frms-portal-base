package cn.com.bsfit.frms.portal.base.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cn.com.bsfit.frms.portal.base.log.LogDBUtil;

public class LogBackTest {
	static Logger logger = LoggerFactory.getLogger(LogBackTest.class);
	
	public static void main(String[] args) {
		LogDBUtil.info(LogBackTest.class, "测试日志", "test1");
		logger.info("又一个测试日志");
//		LogDBUtil.warn(LogBackTest.class, "2拉了拉啦啦啦2");
//		LogDBUtil.error(LogBackTest.class, "2拉了拉啦啦啦2");
	}
}

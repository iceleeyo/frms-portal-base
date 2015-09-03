package cn.com.bsfit.frms.portal.base.util;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import cn.com.bsfit.frms.portal.base.log.LogDBUtil;

/**
 * 反射的工具类
 * 
 * @author hjp
 * 
 * @since 1.0.0
 *
 */
public class ReflectUtil {

	/**
	 * 将POJO对象转成Map
	 * 
	 * @param obj
	 * @return
	 */
	public static Map<String, Object> pojoToMap(Object obj) {
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			Class<?> c = obj.getClass();
			Method m[] = c.getDeclaredMethods();
			for (Method aM : m) {
				String methodName = aM.getName();
				if (methodName.indexOf("get") == 0) {
					map.put((char) (methodName.charAt(3) + 32) + methodName.substring(4), aM.invoke(obj));
				}
			}
		} catch (Throwable e) {
			LogDBUtil.error(ReflectUtil.class, e.getMessage());
		}
		return map;
	}
}

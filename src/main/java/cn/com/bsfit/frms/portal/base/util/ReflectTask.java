package cn.com.bsfit.frms.portal.base.util;

import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/**
 * 使用反射+多线程来调用方法
 * 
 * @author hjp
 * 
 * @since 1.0.0
 *
 * @param <V>
 * 
 */
public class ReflectTask<V> implements Callable<V> {

	private Object obj;
	private String methodName;
	private Class<?>[] parameterTypes;
	private Object[] args;

	/**
	 * 使用反射+多线程来调用方法
	 * @param obj 需要调用方法的对象
	 * @param methodName 方法名称
	 * @param parameterTypes 方法参数列表
	 * @param args 参数
	 */
	public ReflectTask(Object obj, String methodName, Class<?>[] parameterTypes, Object... args) {
		this.obj = obj;
		this.methodName = methodName;
		this.parameterTypes = parameterTypes;
		this.args = args;
	}

	@SuppressWarnings("unchecked")
	public V call() throws Exception {
		Method m = obj.getClass().getDeclaredMethod(methodName, parameterTypes);
		return (V) m.invoke(obj, args);
	}
}

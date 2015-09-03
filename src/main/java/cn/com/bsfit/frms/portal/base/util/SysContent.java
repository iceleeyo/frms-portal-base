package cn.com.bsfit.frms.portal.base.util;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.com.bsfit.frms.portal.base.pojo.Users;

public class SysContent {

	private final static ThreadLocal<HttpServletRequest> requestLocal = new ThreadLocal<HttpServletRequest>();
	private final static ThreadLocal<HttpServletResponse> responseLocal = new ThreadLocal<HttpServletResponse>();
	private final static ThreadLocal<Users> userLocal = new ThreadLocal<Users>();
	
	public static Users getUser() {
		return userLocal.get();
	}

	public static void setUser(Users users) {
		userLocal.set(users);
	}

	public static HttpServletRequest getRequest() {
		return requestLocal.get();
	}

	public static void setRequest(HttpServletRequest request) {
		requestLocal.set(request);
	}

	public static HttpServletResponse getResponse() {
		return responseLocal.get();
	}

	public static void setResponse(HttpServletResponse response) {
		responseLocal.set(response);
	}

	public static HttpSession getSession() {
		return requestLocal.get().getSession();
	}

	public static String getCookieValue(String cookieName) {
		Cookie cookies[] = requestLocal.get().getCookies();
		if (cookies != null) {
			for (Cookie cookie : cookies) {
				if (cookieName.equals(cookie.getName())) {
					return cookie.getValue();
				}
			}
		}
		return null;
	}
}

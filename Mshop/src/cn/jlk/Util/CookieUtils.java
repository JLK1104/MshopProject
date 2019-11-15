package cn.jlk.Util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookieUtils {
	/**
	 * 定义一个专门负责保存cookie的方法，可以设置cookie的名字和保存时间
	 * @param request 主要设置cookie的保存路径，如果不设置保存不上
	 * @param response 主要可以使用addCookie()方法保存cookie对象
	 * @param name 要保存的cookie姓名
	 * @param value 要保存的cookie内容
	 * @param expiry cookie的失效时间
	 * @return 保存成功返回true，否则返回false
	 */
	public static void save(HttpServletRequest request,HttpServletResponse response,String name,String value,Integer expiry){
		Cookie c=new Cookie(name, value);
		c.setMaxAge(expiry);
		c.setPath(request.getContextPath());//设置保存路径
		response.addCookie(c);
	}
	/**
	 * 将所有的cookie保存在map集合里返回
	 * @param request request请求
	 * @return 返回的map集合
	 */
	public static Map<String,String> load(HttpServletRequest request){
		Map<String, String> map= new HashMap<String, String>();
		Cookie c[]=request.getCookies();
		for (int i = 0; i < c.length; i++) {
			map.put(c[i].getName(), c[i].getValue());
		}
		return map;
	}
	/**
	 * 清除cookie
	 * @param request Http请求
	 * @param response Http回应
	 */
	public static void clear(HttpServletRequest request,HttpServletResponse response){
		Map<String,String> map=load(request);
		Iterator<Map.Entry<String, String>> iter=map.entrySet().iterator();
		while (iter.hasNext()) {
			Map.Entry<String, String> me=iter.next();
			Cookie c=new Cookie(me.getKey(), "");
			c.setPath(request.getContextPath());
			c.setMaxAge(0);
			response.addCookie(c);
		}
	}

}

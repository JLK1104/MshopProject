package cn.jlk.Util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookieUtils {
	/**
	 * ����һ��ר�Ÿ��𱣴�cookie�ķ�������������cookie�����ֺͱ���ʱ��
	 * @param request ��Ҫ����cookie�ı���·������������ñ��治��
	 * @param response ��Ҫ����ʹ��addCookie()��������cookie����
	 * @param name Ҫ�����cookie����
	 * @param value Ҫ�����cookie����
	 * @param expiry cookie��ʧЧʱ��
	 * @return ����ɹ�����true�����򷵻�false
	 */
	public static void save(HttpServletRequest request,HttpServletResponse response,String name,String value,Integer expiry){
		Cookie c=new Cookie(name, value);
		c.setMaxAge(expiry);
		c.setPath(request.getContextPath());//���ñ���·��
		response.addCookie(c);
	}
	/**
	 * �����е�cookie������map�����ﷵ��
	 * @param request request����
	 * @return ���ص�map����
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
	 * ���cookie
	 * @param request Http����
	 * @param response Http��Ӧ
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

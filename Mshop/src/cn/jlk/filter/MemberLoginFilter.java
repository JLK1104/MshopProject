package cn.jlk.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

//@WebFilter(filterName="MemberLoginFilter",urlPatterns="/pages/*")
public class MemberLoginFilter implements Filter{

	@Override
	public void destroy() {
		
	}
	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse,
			FilterChain filterChain) throws IOException, ServletException {
		HttpServletRequest request=(HttpServletRequest) servletRequest ;
		HttpSession ses=request.getSession();
		if (ses.getAttribute("aid")!=null) {//不为空表示登录过
			filterChain.doFilter(servletRequest,servletResponse);
		}else {
			request.setAttribute("msg", "您还没有登录，请先登录后操作！");
			request.setAttribute("url", "/Mshop/pages/back/login.jsp");
			request.getRequestDispatcher("/pages/forward.jsp").forward(servletRequest, servletResponse);;
		}
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		
	}

}

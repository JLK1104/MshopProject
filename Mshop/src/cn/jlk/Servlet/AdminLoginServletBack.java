package cn.jlk.Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.jlk.Factory.BackServiceFactory;
import cn.jlk.Util.UtilsDemo;
import cn.jlk.VO.Admin;


@SuppressWarnings("serial")
@WebServlet(name="AdminLoginServletBack",urlPatterns="/AdminLoginServletBack/*")
public class AdminLoginServletBack extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String path="/pages/errors.jsp";
		String status=request.getRequestURI().substring(request.getRequestURI().lastIndexOf("/")+1);
		if (status!=null) {
			if (status.equals("login")) {
				path=this.login(request);
			}else if (status.equals("loginOut")) {
				path=this.loginOut(request);
			}
		}
		request.getRequestDispatcher(path).forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doGet(request, response); 
	}
	
	public String login(HttpServletRequest request){
		String msg=null;
		String url=null;
		String aid=request.getParameter("aid");
		String password=request.getParameter("password");
		if (UtilsDemo.validateEmpty(aid)&&UtilsDemo.validateEmpty(password)) {
			Admin vo=new Admin();
			vo.setAid(aid);
			vo.setPassword(password);
			try {
				if (BackServiceFactory.getInstanceIAdminServiceBack().login(vo)) {
					request.getSession().setAttribute("aid", vo.getAid());
					request.getSession().setAttribute("lastdate", vo.getLastdate());
					msg="管理员，登陆成功";
					url="/Mshop/pages/back/admin/back_index.jsp";
				}else{
					msg="登录失败,错误的用户名或密码";
					url="/Mshop/pages/back/login.jsp";
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else {
			msg="管理员信息填写错误，请重新填写";
			url="/Mshop/pages/back/login.jsp";
		}
		request.setAttribute("msg", msg);
		request.setAttribute("url", url);
		return "/pages/forward.jsp";
	}
	public String loginOut(HttpServletRequest request){
		request.getSession().invalidate();
		request.setAttribute("msg", "管理员注销成功！");
		request.setAttribute("url", "/Mshop/pages/back/login.jsp");
		return "/pages/forward.jsp";
	}
}

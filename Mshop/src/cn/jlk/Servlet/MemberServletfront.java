package cn.jlk.Servlet;

import java.io.IOException;
import java.util.Date;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.jlk.Factory.FrontServiceFactory;
import cn.jlk.Util.BasePath;
import cn.jlk.Util.CookieUtils;
import cn.jlk.Util.MD5Util;
import cn.jlk.Util.UtilsDemo;
import cn.jlk.VO.Member;

@SuppressWarnings("serial")
@WebServlet(name="MemberServletfront",urlPatterns="/MemberServletfront/*")
public class MemberServletfront extends HttpServlet{

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String path="/pages/errors.jsp";
		String status=request.getRequestURI().substring(request.getRequestURI().lastIndexOf("/")+1);
		if (status!=null) {
			if (status.equals("regist")) {//账户注册操作
				path=this.regist(request);
			}else if (status.equals("active")) {//账户激活操作
				path=this.active(request);
			}else if (status.equals("login")) {//登录操作
				path=this.login(request,response);
			}else if (status.equals("out")) {
				path=this.loginOut(request, response);
			}
		}
		request.getRequestDispatcher(path).forward(request, response);	        
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doGet(request, response); 
	}
	@SuppressWarnings("static-access")
	public String regist(HttpServletRequest request){
		String msg=null;
		String url=null;
		String mid=request.getParameter("mid");
		String password=request.getParameter("password");
		if (UtilsDemo.validateEmpty(mid)&&UtilsDemo.validateEmpty(password)) {
			Member vo=new Member();
			vo.setMid(mid);
			vo.setPassword(new MD5Util().MD5Encode(password,"UTF8"));//MD5加密
			vo.setRegdate(new Date());
			vo.setPhoto("nophoto.jpg");
			vo.setCode(UUID.randomUUID().toString());//生成一个随机码
			vo.setStatus(2);//现在属于待激活状态
			try {
				if(FrontServiceFactory.getInstanceIfrontService().regist(vo)){
					msg="用户注册成功，请进行账户激活。";
					url="/Mshop/index.jsp";
					System.out.println("【账户激活】"+BasePath.getBasePath(request)+"/MemberServletfront/active?mid="+vo.getMid()+"&code="+vo.getCode());
				}else{
					msg="用户注册失败，请填写新的注册信息！";
					url="/Mshop/pages/register.jsp";
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else {
			msg="输入的用户注册信息不正确，请重新注册！";
			url="/Mshop/pages/register.jsp";
		}
		request.setAttribute("msg", msg);
		request.setAttribute("url", url);
		return "/pages/forward.jsp";
	}
	
	public String active(HttpServletRequest request){
		String msg=null;
		String url=null;
		String mid=request.getParameter("mid");
		String code=request.getParameter("code");
		if (UtilsDemo.validateEmpty(mid)&&UtilsDemo.validateEmpty(code)) {
			Member vo=new Member();
			vo.setMid(mid);
			vo.setCode(code);
			try {
				if(FrontServiceFactory.getInstanceIfrontService().active(vo)) {
					msg="账户激活成功，请登录。";
					url="/Mshop/pages/login.jsp";
				}else {
					msg="账户激活失败！";
					url="/Mshop/index.jsp";
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else{
			msg="错误的激活操作，请与管理员联系！";
			url="/Mshop/index.jsp";
		}
		request.setAttribute("msg", msg);
		request.setAttribute("url", url);
		return "/pages/forward.jsp";
	}
	public String login(HttpServletRequest request, HttpServletResponse response){
		String msg=null;
		String url=null;
		String mid=request.getParameter("mid");
		String password=request.getParameter("password");
		if (UtilsDemo.validateEmpty(mid)&&UtilsDemo.validateEmpty(password)) {
			try {
				Member vo=new Member();
				vo=FrontServiceFactory.getInstanceIfrontService().login(mid);
				if (vo.getStatus()!=1) {
					msg="请先进行激活操作！";
					url="/Mshop/index.jsp";
					request.setAttribute("msg", msg);
					request.setAttribute("url", url);
					return "/Mshop/pages/forward.jsp"; 
				}
				if(mid.equals(vo.getMid()) && MD5Util.MD5Encode(password,"UTF8").equals(vo.getPassword())) {//账号密码相同
					request.getSession().setAttribute("mid", mid);
					request.getSession().setAttribute("photo", vo.getPhoto());
					CookieUtils.save(request, response, vo.getMid(), vo.getPassword(), 7776000);
					msg="登陆成功";
					url="/Mshop/index.jsp";
				}else{
					msg="登录失败,错误的用户名或密码！";
					url="/Mshop/pages/login.jsp";		
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else{
			msg="有错误，请与管理员联系";
			url="/Mshop/pages/login.jsp";
		}
		request.setAttribute("msg", msg);
		request.setAttribute("url", url);
		return "/pages/forward.jsp";
	}
	/**
	 * 安全退出，包括清除cookie信息
	 * @param request 
	 * @param response
	 * @return 
	 */
	public String loginOut(HttpServletRequest request,HttpServletResponse response){
		CookieUtils.clear(request, response);
		request.getSession().invalidate();
		request.setAttribute("msg","您已安全退出！");
		request.setAttribute("url", "/Mshop/index.jsp");
		return "/pages/forward.jsp";
	}
	
}

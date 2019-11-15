package cn.jlk.Servlet;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.jlk.Factory.BackServiceFactory;
import cn.jlk.Util.UtilsDemo;


@SuppressWarnings("serial")
//@WebServlet(name="MemberServletBack",urlPatterns="/MemberServletBack/*")
public class MemberServletBack extends HttpServlet{
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String path="/pages/errors.jsp";
		String status=request.getRequestURI().substring(request.getRequestURI().lastIndexOf("/")+1);
		if (status!=null) {
			if ("list".equals(status)) {
				path=this.list(request);
			}else if ("updateActive".equals(status)) {
				path=this.updateActive(request);
			}else if ("statuslist".equals(status)) {
				path=this.statuslist(request);
			}
		}
		request.getRequestDispatcher(path).forward(request, response);//服务器跳转/转发
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doGet(request, response); 
	}
	
	public String statuslist(HttpServletRequest request){
		int currentPage=1;
		int linesize=5;
		String column=null;
		String keyword=null;
	    int status=0;
		try {
			currentPage=Integer.parseInt(request.getParameter("cp"));//当前所在页
		} catch (Exception e) {}
		try {
			linesize=Integer.parseInt(request.getParameter("ls"));//每页显示的行数
		} catch (Exception e) {}
		try {
			status=Integer.parseInt(request.getParameter("status"));
		} catch (Exception e) {}
		column=request.getParameter("col");//模糊查询列
		keyword=request.getParameter("kw");//模糊查询关键字
		if (column==null) {
			column="mid";//如果column为空，根据mid查找			
		}
		if (keyword==null) {
			keyword="";//表示查询全部
		}
		try {
			Map<String, Object> map=BackServiceFactory.getInstanceIMemberServiceBack().getListByStatus(status,currentPage, linesize, column, keyword);
			request.setAttribute("allMembers",map.get("allMembers"));
			request.setAttribute("allRecoders",map.get("allRecoders"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		request.setAttribute("currentPage", currentPage);
		request.setAttribute("linesize",linesize);
		request.setAttribute("column", column);
		request.setAttribute("url", "/MemberServletBack/statuslist");
		return "/pages/back/admin/tables.jsp";
	}
	
	public String list(HttpServletRequest request){
		int currentPage=1;
		int linesize=5;
		String column=null;
		String keyword=null;
		try {
			currentPage=Integer.parseInt(request.getParameter("cp"));//当前所在页
		} catch (Exception e) {}
		try {
			linesize=Integer.parseInt(request.getParameter("ls"));//每页显示的行数
		} catch (Exception e) {}
		column=request.getParameter("col");//模糊查询列
		keyword=request.getParameter("kw");//模糊查询关键字
		if (column==null) {
			column="mid";//如果column为空，根据mid查找			
		}
		if (keyword==null) {
			keyword="";//表示查询全部
		}
		try {
			Map<String, Object> map=BackServiceFactory.getInstanceIMemberServiceBack().list(currentPage, linesize, column, keyword);
			request.setAttribute("allMembers",map.get("allMembers"));
			request.setAttribute("allRecoders",map.get("allRecoders"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		request.setAttribute("currentPage", currentPage);
		request.setAttribute("linesize",linesize);
		request.setAttribute("column", column);
		request.setAttribute("keyword", keyword);
		request.setAttribute("url", "/MemberServletBack/list");
		return "/pages/back/admin/tables.jsp";
	}
	
	public String updateActive(HttpServletRequest request){
//		Enumeration<String> enu=request.getHeaderNames();
//		while (enu.hasMoreElements()) {
//			String name=enu.nextElement();
//			System.out.println("**** name="+name+",value="+request.getHeaderNames());
//		}
		String url=request.getHeader("referer");//取得之前的路径
		String msg=null;
		String all=request.getParameter("all");
		if (UtilsDemo.validateEmpty(all)) {
	
		}else{
			msg="您还未选择更新数据，请重新操作！";
		}
		request.setAttribute("msg", msg);
		request.setAttribute("url", url);
		return "/pages/forward.jsp";
	}
}

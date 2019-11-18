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
import net.sf.json.JSONObject;


@SuppressWarnings("serial")
@WebServlet(name="SplitPageServlet",urlPatterns="/SplitPageServlet/*")
public class SplitPageServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		String path="/pages/errors.jsp";
		String status=request.getRequestURI().substring(request.getRequestURI().lastIndexOf("/")+1);
		if (status!=null) {
			if ("list".equals(status)) {
				try {
					this.list(request,response);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}else if ("statuslist".equals(status)){
				this.statuslist(request,response);
			}
//			else if ("updateActive".equals(status)) {
//				path=this.updateActive(request);
//			}else if ("statuslist".equals(status)) {
//				path=this.statuslist(request);
//			}
		}
//		request.getRequestDispatcher(path).forward(request, response);//服务器跳转/转发
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doGet(request, response); 
	}
	
	public void statuslist(HttpServletRequest request, HttpServletResponse response) throws IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html");
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
		if (column==null||column.equals("")) {
			column="mid";//如果column为空，根据mid查找			
		}
		if (keyword==null||keyword.equals("")) {
			keyword="";//表示查询全部
		}
		JSONObject all=new JSONObject();
		try {
			Map<String, Object> map=BackServiceFactory.getInstanceIMemberServiceBack().getListByStatus(status,currentPage, linesize, column, keyword);
//			request.setAttribute("allMembers",map.get("allMembers"));
//			request.setAttribute("allRecoders",map.get("allRecoders"));
			all.put("allMembers", map.get("allMembers"));//查询到的member内容
			all.put("allRecorders",map.get("allRecorders"));//查询到的总记录数
		} catch (Exception e) {
			e.printStackTrace();
		}
		all.put("currentPage", currentPage);
		all.put("lineSize", linesize);
		all.put("column", column);
		all.put("keyword", keyword);
		response.getWriter().print(all);
//		request.setAttribute("currentPage", currentPage);
//		request.setAttribute("linesize",linesize);
//		request.setAttribute("column", column);
//		request.setAttribute("url", "/MemberServletBack/statuslist");
//		return "/pages/back/admin/tables.jsp";
	}
	
	public void list(HttpServletRequest request,HttpServletResponse response) throws Exception{
		request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
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
		if (column==null||column.equals("")) {
			column="mid";//如果column为空，根据mid查找			
		}
		if (keyword==null||keyword.equals("")) {
			keyword="";//表示查询全部
		}
		JSONObject all=new JSONObject();
		try {
			Map<String, Object> map=BackServiceFactory.getInstanceIMemberServiceBack().list(currentPage, linesize, column, keyword);
			all.put("allMembers", map.get("allMembers"));//查询到的member内容
			all.put("allRecorders",map.get("allRecorders"));//查询到的总记录数
//			request.setAttribute("allMembers",map.get("allMembers"));
//			request.setAttribute("allRecoders",map.get("allRecorders"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		all.put("currentPage", currentPage);
		all.put("lineSize", linesize);
		all.put("column", column);
		all.put("keyword", keyword);
//		request.setAttribute("currentPage", currentPage);
//		request.setAttribute("linesize",linesize);
//		request.setAttribute("column", column);
//		request.setAttribute("keyword", keyword);
//		request.setAttribute("url", "/MemberServletBack/list");
//		return "/pages/back/admin/tables.jsp";
		response.getWriter().print(all);
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

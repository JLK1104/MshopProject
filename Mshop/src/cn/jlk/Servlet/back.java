package cn.jlk.Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@SuppressWarnings("serial")
//@WebServlet(name="MemberServletfront",urlPatterns="/pages/MemberServletfront/*")
public class back extends HttpServlet{

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String path="/pages/errors.jsp";
		String status=request.getRequestURI().substring(request.getRequestURI().lastIndexOf("/")+1);
		if (status!=null) {}
		request.getRequestDispatcher(path).forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doGet(request, response); 
	}
	
}

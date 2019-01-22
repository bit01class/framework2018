package com.bit.util;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.controller.IndexController;

public class DispatcherServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		BitController controller=null;
		String url=req.getRequestURI().substring(req.getContextPath().length());
		
		if("/index.do".equals(url)){
			controller=new IndexController();
		}
		
		String view="";
		try {
			view=controller.execute(req);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		if(view.startsWith("redirect:")){
			resp.sendRedirect(view.substring("redirect:".length()));
		}else{
			req.getRequestDispatcher("/WEB-INF/view/"+view+".jsp").forward(req, resp);
		}
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		doGet(req, resp);
	}
}





















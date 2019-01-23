package com.bit.core;

import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DispatcherServlet extends HttpServlet{
	HashMap<String, BitController> map =new HashMap<String, BitController>();

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		Enumeration<String> names = config.getInitParameterNames();
		while(names.hasMoreElements()){
			String name=names.nextElement();
			String value=config.getInitParameter(name);
			try {
				Class<?> clz = Class.forName(value);
				BitController controller=(BitController)clz.newInstance();
				map.put(name, controller);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		doGet(req, resp);
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		String prifix="/WEB-INF/view/";
		String suffix=".jsp";
		String redirect="redirect:";
		String url=req.getRequestURI().substring(req.getContextPath().length());
		
		BitController controller = map.get(url);
		
		String viewname=controller.execute(req);
		if(viewname.startsWith(redirect)){
			resp.sendRedirect(viewname.substring(redirect.length()));
		}else{
			req.getRequestDispatcher(prifix+viewname+suffix).forward(req, resp);
		}
		
		
	}
}

















package com.bit.core;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DispatcherServlet extends HttpServlet{
	HendlerMapping hendler=new HendlerMapping();

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		Properties prop=new Properties();
		InputStream rsa = getClass().getClassLoader().getResourceAsStream("bit.properties");
		
		try {
			prop.load(rsa);
		} catch (IOException e) {
			e.printStackTrace();
		}

		Set<Object> keys = prop.keySet();
		Iterator<Object> ite = keys.iterator();
		while(ite.hasNext()){
			String key =(String) ite.next();
			String value = prop.getProperty(key);
			hendler.addMapping(key, value);
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
		
		BitController controller = hendler.getController(url);
		
		String viewname=controller.execute(req);
		if(viewname.startsWith(redirect)){
			resp.sendRedirect(viewname.substring(redirect.length()));
		}else{
			req.getRequestDispatcher(prifix+viewname+suffix).forward(req, resp);
		}
		
		
	}
}

















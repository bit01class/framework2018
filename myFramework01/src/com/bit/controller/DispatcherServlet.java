package com.bit.controller;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * index.do - 
 * intro.do - 
 * list.do - 
 * add.do - 
 * 
*/

public class DispatcherServlet extends HttpServlet {
	Logger logger=Logger.getGlobal();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doDo(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doDo(req, resp);
	}
	
	private void doDo(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException{
		
		String url=req.getRequestURI().substring(req.getContextPath().length());
		
		logger.addHandler(new FileHandler("c:\\java\\log\\test.log"));
		logger.info(url);
		
//		logger.severe(url);
//		logger.warning(url);
		
		
		String path="";
		BitController controller =null;
		if("/index.do".equals(url)){
			controller = new IndexController();
		}else if("/intro.do".equals(url)){
			controller = new IntroController();
		}else if("/list.do".equals(url)){
			controller = new ListController();
		}else if("/add.do".equals(url)){
			controller = new AddController();
		}else if("/insert.do".equals(url)){
			controller = new InsertController();
		}else if("/detail.do".equals(url)){
			controller = new OneController();
		}else if("/delete.do".equals(url)){
			controller = new DelController();
		}

		path=controller.execute(req);
		
		if(path.startsWith("redirect:")){
			resp.sendRedirect(path.substring("redirect:".length()));
		}else{
			RequestDispatcher rd = req.getRequestDispatcher(path);
			rd.forward(req, resp);
		}
	}
}





























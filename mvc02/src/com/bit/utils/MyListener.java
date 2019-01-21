package com.bit.utils;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyListener implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		System.out.println("contextDestroyed... ");
	}

	@Override
	public void contextInitialized(ServletContextEvent event) {
		System.out.println("contextInitialized... ");
		ServletContext cntxt = event.getServletContext();
		
		
	}

}





























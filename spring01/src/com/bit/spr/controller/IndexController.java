package com.bit.spr.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class IndexController implements Controller{

	private String viewName;
	
	public void setViewName(String viewName) {
		this.viewName = viewName;
	}

	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		System.out.println("indexController ... ");
		ModelAndView mav = new ModelAndView();
		mav.setViewName(viewName);
		
		return mav;
	}

}










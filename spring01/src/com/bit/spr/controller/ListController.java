package com.bit.spr.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.bit.spr.model.Bbs03Dao;

public class ListController implements Controller {
	Bbs03Dao dao;
	
	public void setDao(Bbs03Dao dao) {
		this.dao = dao;
	}
	
	public ListController() {
		System.out.println("new ListController()...");
	}

	@Override
	public ModelAndView handleRequest(HttpServletRequest req,
			HttpServletResponse arg1) throws Exception {
		
		
		ModelAndView mav=new ModelAndView();
//		req.setAttribute("alist", dao.selectAll());
		mav.addObject("alist", dao.selectAll());
		mav.setViewName("list");
		
		return mav;
	}

}

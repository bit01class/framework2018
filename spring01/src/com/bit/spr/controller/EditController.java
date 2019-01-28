package com.bit.spr.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.bit.spr.model.Bbs03Dao;

public class EditController implements Controller {
	public EditController() {
		System.out.println("new EditController()...");
	}

	@Override
	public ModelAndView handleRequest(HttpServletRequest req,
			HttpServletResponse arg1) throws Exception {
		ModelAndView mav=new ModelAndView();
		
		int num=Integer.parseInt(req.getParameter("idx"));
		
		Bbs03Dao dao=new Bbs03Dao();
		
		mav.addObject("bean", dao.selectOne(num));
		mav.setViewName("edit");
		
		return mav;
	}

}

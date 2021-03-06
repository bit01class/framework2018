package com.bit.spr.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.bit.spr.model.Bbs03Dao;

public class DetailController implements Controller {
	Bbs03Dao dao;
	
	public void setDao(Bbs03Dao dao) {
		this.dao = dao;
	}

	@Override
	public ModelAndView handleRequest(HttpServletRequest req,
			HttpServletResponse arg1) throws Exception {
		ModelAndView mav=new ModelAndView();
		
		int num=Integer.parseInt(req.getParameter("idx"));
		
		
		mav.addObject("bean", dao.selectOne(num));
		mav.setViewName("detail");
		
		return mav;
	}

}

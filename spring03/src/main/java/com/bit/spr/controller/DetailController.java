package com.bit.spr.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.bit.spr.model.Bbs06Dao;

public class DetailController implements Controller {
	Bbs06Dao dao;
	
	public void setDao(Bbs06Dao dao) {
		this.dao = dao;
	}

	@Override
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		ModelAndView mav =new ModelAndView();
		int idx=Integer.parseInt(request.getParameter("idx"));
		mav.addObject("bean", dao.selectOne(idx));
		mav.setViewName("detail");
		return mav;
	}

}

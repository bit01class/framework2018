package com.bit.spr.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.bit.spr.model.Bbs06Dao;
import com.bit.spr.model.Bbs06Dao1;
import com.bit.spr.model.Bbs06Dao2;

public class ListController implements Controller{
	Bbs06Dao dao;
	
	public void setDao(Bbs06Dao dao) {
		this.dao = dao;
	}

	@Override
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		ModelAndView mav =new ModelAndView();
		mav.addObject("alist", dao.selectAll());
		mav.setViewName("list");
		return mav;
	}

}

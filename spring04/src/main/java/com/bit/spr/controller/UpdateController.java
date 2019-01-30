package com.bit.spr.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.bit.spr.model.Bbs06Dao;
import com.bit.spr.model.entity.Bbs06Vo;

public class UpdateController implements Controller {
	@Autowired
	private Bbs06Dao bbs06Dao;

	@Override
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		int num=Integer.parseInt(request.getParameter("num"));
		if(request.getMethod().equals("GET"))return new ModelAndView("redirect:edit.do?idx="+num);
		
		int result=bbs06Dao.updateOne(new Bbs06Vo(num, null, request.getParameter("sub"), 
				request.getParameter("content"), 0));
		if(result>0)return new ModelAndView("redirect:detail.do?idx="+num);
		return new ModelAndView("redirect:edit.do?idx="+num);
	}

}

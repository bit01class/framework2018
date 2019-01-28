package com.bit.spr.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.bit.spr.model.Bbs03Dao;

public class DelController extends AbstractController {
	Bbs03Dao dao;
	
	public void setDao(Bbs03Dao dao) {
		this.dao = dao;
	}

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest req,
			HttpServletResponse arg1) throws Exception {
		//System.out.println("delController run..."+req.getParameter("idx"));
		int num=Integer.parseInt(req.getParameter("idx"));
		int result=dao.deleteOne(num);
		return null;
	}

}

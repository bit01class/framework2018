package com.bit.spr.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.bit.spr.model.Bbs03Dao;

public class DelController extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest req,
			HttpServletResponse arg1) throws Exception {
		//System.out.println("delController run..."+req.getParameter("idx"));
		int num=Integer.parseInt(req.getParameter("idx"));
		Bbs03Dao dao = new Bbs03Dao();
		int result=dao.deleteOne(num);
		return null;
	}

}

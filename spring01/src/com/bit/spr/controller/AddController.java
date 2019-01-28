package com.bit.spr.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import org.springframework.web.servlet.mvc.Controller;

import com.bit.spr.model.Bbs03Dao;

public class AddController extends AbstractController {
	Bbs03Dao dao;
	
	public void setDao(Bbs03Dao dao) {
		this.dao = dao;
	}
	
	public AddController() {
		System.out.println("new AddController()...");
	}

//	@Override
//	public ModelAndView handleRequest(HttpServletRequest req,
//			HttpServletResponse arg1) throws Exception {
//		ModelAndView mav=new ModelAndView();
//		
//		if("POST".equals(req.getMethod())){
//		
//			String name=req.getParameter("name");
//			String sub=req.getParameter("sub");
//			String content=req.getParameter("content");
//			
//			Bbs03Dao dao = new Bbs03Dao();
//			dao.insertOne(name, sub, content);
//			
//			mav.setViewName("redirect:list.do");
//		}else{
//			mav.setViewName("add");
//		}
//		return mav;
//	}

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest req,
			HttpServletResponse arg1) throws Exception {
		ModelAndView mav = new ModelAndView();
		String name=req.getParameter("name");
		String sub=req.getParameter("sub");
		String content=req.getParameter("content");
		
		dao.insertOne(name, sub, content);
		
		mav.setViewName("redirect:list.do");
		return mav;
	}

}














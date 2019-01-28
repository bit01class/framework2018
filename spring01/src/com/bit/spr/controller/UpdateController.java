package com.bit.spr.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.bit.spr.model.Bbs03Dao;

public class UpdateController extends AbstractController {
	Bbs03Dao dao;
	
	public void setDao(Bbs03Dao dao) {
		this.dao = dao;
	}

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest req,
			HttpServletResponse res) throws Exception {
		ModelAndView mav=new ModelAndView();
		
		int num=Integer.parseInt(req.getParameter("num"));
		String sub=req.getParameter("sub");
		String content=req.getParameter("content");
		
		int result=dao.updateOne(sub,content,num);
		
		if(result>0) mav.setViewName("redirect:detail.do?idx="+num);
		else mav.setViewName("redirect:edit.do?idx="+num);
		
		return mav;
	}

}













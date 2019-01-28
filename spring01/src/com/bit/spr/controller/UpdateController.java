package com.bit.spr.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.bit.spr.model.Bbs03Dao;

public class UpdateController extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest req,
			HttpServletResponse res) throws Exception {
		ModelAndView mav=new ModelAndView();
		
		int num=Integer.parseInt(req.getParameter("num"));
		String sub=req.getParameter("sub");
		String content=req.getParameter("content");
		
		Bbs03Dao dao =new Bbs03Dao();
		int result=dao.updateOne(sub,content,num);
		
		if(result>0) mav.setViewName("redirect:detail.do?idx="+num);
		else mav.setViewName("redirect:edit.do?idx="+num);
		
		return mav;
	}

}













package com.bit.spr.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.plaf.basic.BasicSliderUI.ActionScroller;

import org.springframework.validation.BindException;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;
import org.springframework.web.servlet.mvc.AbstractController;

import com.bit.spr.model.Bbs06Dao;
import com.bit.spr.model.Bbs06Dao1;
import com.bit.spr.model.Bbs06Dao2;
import com.bit.spr.model.entity.Bbs06Vo;

public class InsertController extends AbstractCommandController{  //extends AbstractController{
	Bbs06Dao dao;
	
	public void setDao(Bbs06Dao dao) {
		this.dao = dao;
	}
	
//	@Override
//	protected ModelAndView handleRequestInternal(HttpServletRequest request,
//			HttpServletResponse response) throws Exception {
//		
//		
//		
//		Bbs06Vo bean=new Bbs06Vo();
//		bean.setSub(request.getParameter("sub"));
//		bean.setContent(request.getParameter("content"));
//		bean.setUserNum(Integer.parseInt(request.getParameter("userNum")));
//		
//		dao.insertOne(bean);
//		
//	}
	@Override
	protected void onBindAndValidate(HttpServletRequest request,
			Object command, BindException errors) throws Exception {
		Bbs06Vo bean=(Bbs06Vo) command;
		String sub=bean.getSub();
		if(sub.equals("")){
			ObjectError error=new ObjectError("sub", "제목없음");
			errors.addError(error);
		}
	}

	@Override
	protected ModelAndView handle(HttpServletRequest request,
			HttpServletResponse response, Object bean, BindException errors)
			throws Exception {
		ModelAndView mav =new ModelAndView();
		String page="redirect:list.do";
		if(errors.getErrorCount()==0){
			dao.insertOne((Bbs06Vo)bean);
		}else{
			page="form";
		}
		mav.setViewName(page);
		return mav;
	}

}




















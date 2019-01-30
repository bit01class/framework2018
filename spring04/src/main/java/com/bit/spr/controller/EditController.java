package com.bit.spr.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.bit.spr.model.Bbs06Dao;

public class EditController implements Controller{
	
	/*
	 * context config : AutowiredAnnotationBeanPostProcessor ���
	 * check
	 * @Autowired	: type	null����	����Ÿ�԰�ü�����
	 * @Inject		: name	null�Ұ���	����Ÿ�԰�ü���
	 */
	@Autowired
	private Bbs06Dao bbs06Dao;
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		int num=Integer.parseInt(request.getParameter("idx"));
		
		return new ModelAndView("edit","bean",bbs06Dao.selectOne(num));
	}

}











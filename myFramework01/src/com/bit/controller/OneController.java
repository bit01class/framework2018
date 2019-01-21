package com.bit.controller;

import javax.servlet.http.HttpServletRequest;

import com.bit.model.BbsDao;
import com.bit.model.entity.BbsVo;

public class OneController implements BitController{

	@Override
	public String execute(HttpServletRequest req) {
		int num=Integer.parseInt(req.getParameter("idx"));
		BbsDao dao=new BbsDao();
		BbsVo bean = dao.selectOne(num);
		req.setAttribute("bean", bean);
		return "detail.jsp";
	}

}

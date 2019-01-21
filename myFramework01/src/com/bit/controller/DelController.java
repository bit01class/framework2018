package com.bit.controller;

import javax.servlet.http.HttpServletRequest;

import com.bit.model.BbsDao;

public class DelController implements BitController {

	@Override
	public String execute(HttpServletRequest req) {
		int num=Integer.parseInt(req.getParameter("idx"));
		BbsDao dao=new BbsDao();
		dao.deleteOne(num);
		return "redirect:list.do";
	}

}

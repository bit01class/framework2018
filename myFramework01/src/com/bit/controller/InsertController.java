package com.bit.controller;

import javax.servlet.http.HttpServletRequest;

import com.bit.model.BbsDao;
import com.bit.model.entity.BbsVo;

public class InsertController implements BitController {

	public String execute(HttpServletRequest req){
		
		BbsDao dao = new BbsDao();
		dao.insertOne(new BbsVo(0,req.getParameter("sub"),req.getParameter("content"),0));
		
		return "redirect:list.do";
	}
}

package com.bit.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import com.bit.model.BbsDao;
import com.bit.model.entity.BbsVo;
import com.bit.util.BitController;

public class InsertController implements BitController {

	@Override
	public String execute(HttpServletRequest req) throws SQLException {
		BbsVo bean=new BbsVo();
		bean.setSub(req.getParameter("sub"));
		bean.setContent(req.getParameter("content"));
		if("POST".equals(req.getMethod())){
			new BbsDao().insertOne(bean);
			return "redirect:list.do";
		}else{
			return "/bbs/add";
		}
	}

}

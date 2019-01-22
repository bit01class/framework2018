package com.bit.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import com.bit.model.BbsDao;
import com.bit.util.BitController;

public class ListController implements BitController {

	@Override
	public String execute(HttpServletRequest req) throws SQLException {
		BbsDao dao=new BbsDao();
		req.setAttribute("alist", dao.selectAll());
		return "bbs/list";
	}

}

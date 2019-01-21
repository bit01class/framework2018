package com.bit.controller;

import java.util.ArrayList;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;

import com.bit.model.BbsDao;
import com.bit.model.entity.BbsVo;

public class ListController implements BitController {
	Logger logger = Logger.getGlobal();

	public String execute(HttpServletRequest req){
		BbsDao dao = new BbsDao();
		ArrayList<BbsVo> list = dao.selectAll();
		
//		for(BbsVo bean : list){
//			logger.info(bean.toString());
//		}
		req.setAttribute("alist", list);
		
		return "list.jsp";
	}
}
















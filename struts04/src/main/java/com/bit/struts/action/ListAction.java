package com.bit.struts.action;

import java.util.List;

import com.bit.model.BbsDao;
import com.bit.model.entity.BbsVo;
import com.opensymphony.xwork2.Action;

public class ListAction implements Action {

	private List<BbsVo> list;
	
	public List<BbsVo> getList() {
		return list;
	}

	@Override
	public String execute() throws Exception {
		BbsDao dao = new BbsDao();
		list=dao.selectAll();
		return SUCCESS;
	}

}

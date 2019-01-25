package com.bit.struts.action;

import com.bit.struts.model.BbsDao;
import com.bit.struts.model.BbsDaoImpl2;
import com.bit.struts.model.entity.BbsVo;
import com.opensymphony.xwork2.Action;

public class DetailAction implements Action{

	private int idx;
	private BbsVo bean;
	
	public void setIdx(int idx) {
		this.idx = idx;
	}
	
	public BbsVo getBean() {
		return bean;
	}

	@Override
	public String execute() throws Exception {
		BbsDao dao = new BbsDaoImpl2();
		bean=dao.selectOne(idx);
		return Action.SUCCESS;
	}

}

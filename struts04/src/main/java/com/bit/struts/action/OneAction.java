package com.bit.struts.action;

import com.bit.model.BbsDao;
import com.bit.model.entity.BbsVo;
import com.opensymphony.xwork2.Action;

public class OneAction implements Action {
	private BbsVo bean;
	
	public void setBean(BbsVo bean) {
		this.bean = bean;
	}
	
	public BbsVo getBean() {
		return bean;
	}

	@Override
	public String execute() throws Exception {
		BbsDao dao = new BbsDao();
		bean= dao.selectOne(bean.getIdx());
		return Action.SUCCESS;
	}

}

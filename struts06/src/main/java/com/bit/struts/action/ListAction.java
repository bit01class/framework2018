package com.bit.struts.action;

import java.util.List;

import org.apache.log4j.Logger;

import com.bit.struts.model.BbsDao;
import com.bit.struts.model.BbsDaoImpl;
import com.bit.struts.model.BbsDaoImpl2;
import com.bit.struts.model.entity.BbsVo;
import com.opensymphony.xwork2.Action;

public class ListAction implements Action {
	Logger log=Logger.getLogger("com.bit.struts.action.ListAction");
	private List<BbsVo> list;
	
	public List<BbsVo> getList() {
		return list;
	}

	@Override
	public String execute() throws Exception {
		BbsDao dao=new BbsDaoImpl2();
		list=dao.selectAll();
		return Action.SUCCESS;
	}

}

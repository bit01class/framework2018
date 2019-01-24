package com.bit.struts.action;

import com.bit.model.BbsDao;
import com.opensymphony.xwork2.Action;

public class EditAction implements Action {
	int idx;
	String sub,content;
	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public void setSub(String sub) {
		this.sub = sub;
	}
	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String execute() throws Exception {
		BbsDao dao = new BbsDao();
		int result=dao.updateOne(sub,content,idx);
		if(result==0)return Action.INPUT;
		return Action.SUCCESS;
	}

}

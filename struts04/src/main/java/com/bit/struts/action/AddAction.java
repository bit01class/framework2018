package com.bit.struts.action;

import com.bit.model.BbsDao;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class AddAction extends ActionSupport{ //implements Action {
	String sub,content;
	
	public void setSub(String sub) {
		this.sub = sub;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	@Override
		public void validate() {

			if(sub.equals("")){
				addFieldError("sub", "제목없음");
			}
			if(content.equals("")){
				addFieldError("content", "내용없음");		
			}
		}

	@Override
	public String execute() throws Exception {
//		System.out.println(sub);
//		System.out.println(content);
		
		BbsDao dao = new BbsDao();
		dao.insertOne(sub,content);
		return Action.SUCCESS;
	}

}




















package com.bit.struts.action;

import java.sql.SQLException;

import org.apache.log4j.Logger;

import com.bit.struts.model.BbsDao;
import com.bit.struts.model.BbsDaoImpl;
import com.bit.struts.model.BbsDaoImpl2;
import com.bit.struts.model.entity.BbsVo;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

public class AddAction extends ActionSupport implements ModelDriven<BbsVo>,Preparable{ // {
	Logger log=Logger.getLogger("com.bit.struts.action.AddAction");
	private BbsVo bean;
	
	public void setBean(BbsVo bean) {
		this.bean = bean;
	}
	
	@Override
		public void validate() {
			log.debug("validate...");
			if(bean.getSub().equals("")){
				addFieldError("sub", "제목을 입력");
			}
		}
	
	@Override
	public String execute() throws Exception {
		log.debug(bean);
		BbsDao dao=new BbsDaoImpl2();
		dao.insertOne(bean);
		return Action.SUCCESS;
	}

	@Override
	public BbsVo getModel() {
		return bean;
	}

	@Override
	public void prepare() throws Exception {
		bean=new BbsVo();
		log.debug("객체 생성 및 주입");
	}

	public String edit() throws SQLException{
		BbsDao dao=new BbsDaoImpl2();
		if(dao.updateOne(bean)==0)return Action.ERROR;
		else return Action.SUCCESS;
	}
	
	
}






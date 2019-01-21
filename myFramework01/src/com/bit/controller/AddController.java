package com.bit.controller;

import javax.servlet.http.HttpServletRequest;

public class AddController implements BitController{

	public String execute(HttpServletRequest req){
		return "add.jsp";
	}
}

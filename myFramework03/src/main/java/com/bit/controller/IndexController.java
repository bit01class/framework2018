package com.bit.controller;

import javax.servlet.http.HttpServletRequest;

import com.bit.core.BitController;

public class IndexController implements BitController {

	@Override
	public String execute(HttpServletRequest req) {
		// TODO Auto-generated method stub
		return "index";
	}

}

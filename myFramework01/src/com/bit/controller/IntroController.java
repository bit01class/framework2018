package com.bit.controller;

import javax.servlet.http.HttpServletRequest;

public class IntroController implements BitController {

	public String execute(HttpServletRequest req){
		return "intro.jsp";
	}
}

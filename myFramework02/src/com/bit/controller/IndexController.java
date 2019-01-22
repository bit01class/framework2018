package com.bit.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import com.bit.util.BitController;

public class IndexController implements BitController{

	@Override
	public String execute(HttpServletRequest req) throws SQLException {
		return "index";
	}

}

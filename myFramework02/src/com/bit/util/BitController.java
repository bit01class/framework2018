package com.bit.util;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

public interface BitController {

	String execute(HttpServletRequest req) throws SQLException;
}

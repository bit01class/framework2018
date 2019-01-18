package com.bit.utils;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

public class Myfilter implements Filter {
	String encoding;

	@Override
	public void destroy() {
		System.out.println("filter destroy...");
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse res,
			FilterChain chain) throws IOException, ServletException {
//		System.out.println("filter doFilter...");
//		PrintWriter out = res.getWriter();
//		out.print("filter print...");
		req.setCharacterEncoding(encoding);
		chain.doFilter(req, res);
	}

	@Override
	public void init(FilterConfig config) throws ServletException {
		encoding=config.getInitParameter("encoding");
	}

}












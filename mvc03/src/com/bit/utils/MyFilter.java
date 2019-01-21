package com.bit.utils;

import java.io.IOException;

import javax.jws.soap.InitParam;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

@WebFilter(urlPatterns={"/*"},initParams={
		@WebInitParam(name="filterParam",value="filterValue")
})
public class MyFilter implements Filter{
	String val;

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1,
			FilterChain chain) throws IOException, ServletException {
		System.out.println("doFilter...("+val+")");
		chain.doFilter(arg0, arg1);
	}

	@Override
	public void init(FilterConfig config) throws ServletException {
		System.out.println("filter init...");
		val = config.getInitParameter("filterParam");
	}

}

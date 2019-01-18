package com.bit.controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.model.JavaBean;
@WebServlet("/ex02.do")
public class MainController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		JavaBean bean = new JavaBean();
		bean.setNum(1234);
		bean.setNum2(3.14);
		bean.setCh('@');
		bean.setName("user");
		bean.setNalja(new Date());
		bean.setBoo(true);
		
		request.setAttribute("bean", bean);
		request.getRequestDispatcher("el/ex02.jsp").forward(request, response);
	}

}

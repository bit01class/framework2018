package com.bit.sts02;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

@Controller
public class Ex03Controller {

	@RequestMapping("/ex03")
	public ModelAndView func1() {
		return new ModelAndView("ex01");
	}
	
	@RequestMapping("/ex04")
	public ModelAndView func2() {
		return new ModelAndView("ex01","msg","func02");
	}

	@RequestMapping("/ex05")
	public ModelAndView func3(HttpServletRequest req) {
		
		String msg=req.getParameter("msg");
		return new ModelAndView("ex01","msg",msg);
	}
	
	@RequestMapping("/ex06")
	public String func4() {
		return "ex01";
	}
	
	@RequestMapping("/bbs/ex07")
	public void func5() {
		System.out.println("func5 run...");
	}
	
	@RequestMapping("/ex08")
	public String func6(Model model) {
		model.addAttribute("msg","xyz");
		return "ex01";
	}
	
	@RequestMapping("/ex09")
	public ModelAndView func7 (String msg,int su) {
		System.out.println(su);
		return new ModelAndView("ex01","msg",msg);
	}
}


















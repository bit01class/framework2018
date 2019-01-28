package com.bit.di.spring02;

public class TestBean implements BeanInter {
	String msg="TestBean - func01() run...";
	
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public TestBean() {
		System.out.println("new TestBean()");
	}

	public void func01(){
		System.out.println(msg);
	}
}

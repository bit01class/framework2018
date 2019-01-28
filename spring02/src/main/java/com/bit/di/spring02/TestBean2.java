package com.bit.di.spring02;

public class TestBean2 implements BeanInter {
	int msg;
	
	public void setMsg(int msg) {
		this.msg = msg;
	}
	
	public TestBean2() {
		System.out.println("new TestBean2()..");
	}

	public void func01(){
		System.out.println(msg+1);
	}
}

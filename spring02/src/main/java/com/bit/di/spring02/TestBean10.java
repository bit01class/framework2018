package com.bit.di.spring02;

public class TestBean10 {
	private BeanInter bean;
	
//	public void setBean(BeanInter bean) {
//		this.bean = bean;
//	}
	
	public TestBean10(BeanInter bean) {
		this.bean=bean;
	}

	public void func02(){
		bean.func01();
	}
}

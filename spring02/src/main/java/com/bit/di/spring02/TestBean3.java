package com.bit.di.spring02;

public class TestBean3 implements BeanInter {
	String[] msg;
	
	public void setMsg(String[] msg) {
		this.msg = msg;
	}

	public void func01() {
		for(int i=0; i<msg.length; i++){
			System.out.println(msg[i]);
		}
	}

}

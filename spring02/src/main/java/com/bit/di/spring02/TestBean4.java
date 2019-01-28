package com.bit.di.spring02;

import java.util.List;

public class TestBean4 implements BeanInter {
	List<String> msg;
	
	public void setMsg(List<String> msg) {
		this.msg = msg;
	}

	public void func01() {
	
		for(String ele:msg){
			System.out.println(ele);
		}
	}

}

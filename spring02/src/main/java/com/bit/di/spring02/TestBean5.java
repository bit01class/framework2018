package com.bit.di.spring02;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestBean5 implements BeanInter {
	
	private Map msg;
	
	public void setMsg(Map msg) {
		this.msg = msg;
	}

	public void func01() {
		Set keys=msg.keySet();
		Iterator ite = keys.iterator();
		while(ite.hasNext()){
			String key=(String) ite.next();
			System.out.println(key+":"+msg.get(key));
		}
	}

}
















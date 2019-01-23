package com.bit.core;

import java.util.HashMap;

public class HendlerMapping {
	private HashMap<String, BitController> mapping =new HashMap<String, BitController>();
	
	public void addMapping(String key, String value){
		BitController controller=null;
		try {
			Class<?> clz = Class.forName(value);
			controller=(BitController) clz.newInstance();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		
		mapping.put(key, controller);
	}
	
	public BitController getController(String key){
		return mapping.get(key);
	}
}














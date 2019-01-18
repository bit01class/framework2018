package com.bit.utils;

import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		String msg="java web database spring";

		StringTokenizer token=new StringTokenizer(msg);

		while (token.hasMoreElements()) {
			String ele = (String)token.nextElement();
			System.out.println(ele);
		}
		System.out.println("-------------------------------------");
		String[] arr = msg.split(" ");
		for(String ele : arr){
			System.out.println(ele);
		}
	}
}





















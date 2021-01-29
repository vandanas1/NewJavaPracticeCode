package com.javaTest;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashMapProgram {

	public static void main(String[] args) {
		String string="java java programmer";
		
		String[] splitString= string.split(" ");
		Set<String> st=new HashSet<String>();
		for(String s:splitString){
			st.add(s);
		}
		System.out.println(st);
		
	}

}

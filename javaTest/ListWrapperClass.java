package com.javaTest;

import java.util.ArrayList;
import java.util.List;

public class ListWrapperClass {

	public static void main(String[] args) {
		
		List list1 = new ArrayList();
		list1.add("Mukesh");
		list1.add(123);
		
		String str = (String)list1.get(1);
		
		List<String> stringList = new ArrayList<>();
		stringList.add("Mukesh");
		
		int num = Integer.parseInt("123");
		Integer n = Integer.valueOf(123);

	}

}

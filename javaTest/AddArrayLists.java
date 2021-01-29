package com.javaTest;

import java.util.ArrayList;
import java.util.List;

public class AddArrayLists {

	public static void main(String[] args) {
		    List<String> list =new ArrayList<String>();
			list.add("vandana");
			list.add("aakriti");
			list.add("kahna");
			list.add("mukesh");
			list.add("golu");
			list.add("priyam");
			list.add("vandana");
			list.add("golu");
			System.out.println(list.toString());
			List<String> list1 =new ArrayList<String>();
			list1.add("1");
			list1.add("2");
			list1.add("3");
			list1.add("4");
			list1.add("5");
			list1.add("6");
			list1.add("7");
			list1.add("8");
			list.addAll(list1);
			
			System.out.println("" + list);
		
	}

}

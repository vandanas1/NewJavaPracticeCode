package com.javaTest;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateElementFromArrayList {

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
		//System.out.println(list.toString());
		
		Set<String> s=new LinkedHashSet<String>(list);
		System.out.println(s);
		
		List<String> list1 =new ArrayList<String>();
		list1.addAll(s);
		System.out.println(list1);
		
		
		

	}

}

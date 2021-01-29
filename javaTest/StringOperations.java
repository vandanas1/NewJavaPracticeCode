package com.javaTest;


import java.util.LinkedHashSet;
//import java.util.LinkedHashSet;
import java.util.Set;

public class StringOperations {

	public static void main(String[] args) {
		String str="mmuukkeesshh";
		char[] c = str.toCharArray();
	
		Set<Character> s=new LinkedHashSet<Character>();
		for(char c1:c)
		{
			s.add(c1);
		}
		System.out.println(s);			
	
	StringBuilder sb = new StringBuilder();
	for (Character character : s) {
	    sb.append(character);
	}
	System.out.println(sb.toString());
         }
}


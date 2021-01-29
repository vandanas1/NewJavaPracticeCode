package com.javaTest;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateValueFromStringPractice {
	public static void main(String args[])
	{
		String string="Vandana";
		char[] char1 =string.toCharArray();
		Set<Character> char2=new LinkedHashSet<Character>();
		for(char c:char1)
		{
			char2.add(c);
				
	}
		System.out.println(char2);
		StringBuilder sb=new StringBuilder();
		for(Character charS:char2)
		{
		sb.append(charS);
		
	}
		System.out.println(sb.toString());
}}



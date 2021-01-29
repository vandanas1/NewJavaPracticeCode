package com.javaTest;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesWordsFromString {

	public static void main(String[] args) {
		String stnc="my my name name is is vandana vandana";
		String[] array=stnc.split(" ");
		Set<String> str=new LinkedHashSet<String>();
		String newString = "";
		for(String s:array)
		{
			str.add(s);
		}
		String joined = String.join(" ", str);
		
		System.out.println(joined);
	}

}

package com.javaTest;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {

	public static void main(String[] args) {
		Set<String> str=new HashSet<String>();
		str.add("aa");
		str.add("hh");
		str.add("aa");
		str.add("Ajj");
		str.add("AA");
		str.add("Ayy");
		str.add("vandana");
		str.add("");
		str.add("BB");
		str.add("kanha");
		str.add("aakriti");
		str.add("pooja");
		str.add("cc");
		str.add("Mukesh");
		str.add("DD");
		str.add("EE");
		System.out.println(str);
		str.remove("vandana");
		System.out.println("after removing vandana");
		System.out.println(str);
		/*System.out.println("after iteration");
		Iterator<String> itr = str.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}*/
		
	}

}

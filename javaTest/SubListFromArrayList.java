package com.javaTest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class SubListFromArrayList {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("D");
		al.add("E");
		//ArrayList<String> al1=new ArrayList<String>(al.subList(0, 3));
		//System.out.println(al1);
		
		ArrayList<String> al2=new ArrayList<String>(al.subList(0, 4));
		System.out.println(al2);
		
		List<String> al3=new LinkedList<String>(al.subList(0, 4));
		//System.out.println(al3);
		Iterator<String> ir=al3.iterator();
		while(ir.hasNext()){
			System.out.println(ir.next());
		}
		
		/*ArrayList<String> a=new ArrayList<String>();
		a.add("1");
		a.add("2");
		a.add("3");
		a.add("4");
		a.add("5");
		al.addAll(a);
		System.out.println("adding arrays");
		System.out.println(al);*/

	}
}


package com.javaTest;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList<String> al1 = new LinkedList<String>();
		al1.add("10");
		al1.add("11");
		al1.add("12");
		al1.add("13");
		
		al1.addFirst("9");
		al1.addLast("21");
		
		//Adding element at 3rd position.
		al1.add(2, "20");
		
		//System.out.println(al1.toString());
		Iterator<String> itr= al1.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		System.out.println("after removal");
		al1.remove(1);
		System.out.println(al1);
		al1.removeFirst();
		System.out.println("remove first element");
		System.out.println(al1);
		boolean b=al1.contains("9");
		System.out.println(b);
		Object var = al1.get(2);
		System.out.println(var);

	}

}

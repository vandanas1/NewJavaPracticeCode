package com.javaTest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListTest {

	public static void main(String[] args) {
		
		List<String> list=new ArrayList<String>();
		list.add("AA");
		list.add("BB");
		list.add("CC");
		list.add("CC");
		list.add("CC");
		list.add("CC");
		System.out.println(list);
		Iterator<String> ltr = list.iterator();
		System.out.println("Traversing in forwardkword direction");
		while(ltr.hasNext()){
			System.out.println(ltr.next());
			
		}
		/*System.out.println("Traversing in backword direction");
		while(ltr.hasPrevious()){
			System.out.println(ltr.previous());
		}*/
			

	}

}

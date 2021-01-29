package com.javaTest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;



public class SubListFromLinkedList {

	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		List<Integer> list1= new ArrayList<Integer>(list.subList(1, 6));
		Iterator<Integer> ir= list1.iterator();
		while(ir.hasNext()){
			System.out.println(ir.next());
			
		}
		

	}

}

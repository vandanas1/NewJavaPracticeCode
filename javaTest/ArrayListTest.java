package com.javaTest;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<String> alist = new ArrayList<String>();
		alist.add("Vandana");
		alist.add("Mukesh");
		alist.add("Mukesh");
		
		//alist.remove("Mukesh");
		alist.indexOf("Mukesh");
		System.out.println(alist.indexOf("Mukesh"));
		
		//method used to sort an ArrayList
		Collections.sort(alist);
		System.out.println(alist);
		
		//to adds object at given index
		alist.add(1,"Pooja");
		System.out.println("*************");
		System.out.println(alist);
		
		//Removes element from a given index
		alist.remove(0);
		System.out.println("remove fron 0*************");
		System.out.println(alist);
		
		//set(int index, Object o): Used for updating an element. 
		//It replaces the element present at the specified index with the object o
		alist.set(0, "Mukesh");
		System.out.println("add mukesh at 0*************");
		System.out.println(alist);
		
		// int indexOf(Object o): Gives the index of the object o. 
		//If the element is not found in the list then this method returns the value -1.
		System.out.println("indexof*********");
		System.out.println(alist.indexOf(2));
		
		//Object get(int index): It returns the object of list which is present at the specified index.
		System.out.println("*************");
		System.out.println(alist.get(0));
		
		// int size(): It gives the size of the ArrayList – Number of elements of the list.
		System.out.println("*************");
		System.out.println(alist.size());
		
		 //boolean contains(Object o): It checks whether the given object o is present in the array list 
		 //if its there then it returns true else it returns false.
		Boolean b=alist.contains("pooja");
		System.out.println("boolean*************");
		System.out.println(b);
		
		//clear(): It is used for removing all the elements of the array list in one go. 
		//The below code will remove all the elements of ArrayList
		//alist.clear();
		alist.removeAll(alist);
		System.out.println("clear*************");
		System.out.println(alist);
		System.out.println("after**************************************************");
		ArrayList<String> al=new ArrayList<String>();
		al.add("vandana");
		al.add("Rahul");
		al.add("Priyam");
		al.add("vandana");
		System.out.println(al);
		al.remove("vandana");
		System.out.println(al);
		al.add(2, "bye");
		System.out.println(al);
		al.set(2, "hi");
		System.out.println(al);
		
		
		

	}}



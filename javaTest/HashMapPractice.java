package com.javaTest;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapPractice {

	public static void main(String[] args) {
		Map<Integer,String> hmap=new HashMap<Integer,String>();
		hmap.put(1, "vandana");
		hmap.put(2, "Mukesh");
		hmap.put(3, "aakriti");
		hmap.put(1, "Pramita");
		hmap.put(2, "Kanha");
		hmap.put(null, "Mukesh");
		hmap.put(null, "Vandana");
		hmap.put(4, "");
		hmap.put(5, "");
		
		for(Map.Entry<Integer, String> hmap1:hmap.entrySet()){
			System.out.println(hmap1.getKey()+ " "+ hmap1.getValue());
		}
			
		
		Set<String> set=new HashSet<String>();
		set.add("vandana");
		set.add("mukesh");
		set.add("aakriti");
		set.add("mukesh");
		for(String st:set){
			System.out.println(st);
		}
		System.out.println("using iterator");
		Iterator<String> st= set.iterator();
		while(st.hasNext()){
			System.out.println(st.next());
			
		}
		//Set<Map.Entry<Integer,String>> set1 = hmap.entrySet();
		Iterator<Map.Entry<Integer,String>> hitr= hmap.entrySet().iterator();
		while(hitr.hasNext()){
			Map.Entry<Integer, String> me = hitr.next();
			System.out.println("key vaue is " +me.getKey() +"value is" +me.getValue());
			
		}
}}



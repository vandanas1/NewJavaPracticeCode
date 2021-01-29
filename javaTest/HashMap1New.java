package com.javaTest;

import java.util.HashMap;
import java.util.Map;


public class HashMap1New {

	public static void main(String[] args) {
		Map<Integer,String> hmap=new HashMap<Integer,String>();
		hmap.put(1, "vandana");
		hmap.put(2, "Mukesh");
		hmap.put(3, "aakriti");
		//Set<>
			
			for(Map.Entry<Integer, String> hmap1:hmap.entrySet()){
				hmap.put(4, "pooja");
				System.out.println("test"+hmap1.getKey()+ " "+ hmap1.getValue());
				
				
			}
				

	}

}

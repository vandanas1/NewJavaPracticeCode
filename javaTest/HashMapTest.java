package com.javaTest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap<Integer, String> hmap=new HashMap<Integer, String>();
		hmap.put(1, "Vandana");
		hmap.put(2, "Mukesh");
		hmap.put(3, "Rahul");
		hmap.put(4, "Priyam");
		hmap.put(null, "Sonu");
		hmap.put(6, "mukesh");
		//hmap.clear();
		System.out.println(hmap);
		//hmap.size();
		//System.out.println(hmap);
		
		hmap.clone();
		
		System.out.println("clone of map");
		System.out.println(hmap);
		//System.out.println(set);
		  //Set set = hmap.entrySet();
	      Iterator iterator = hmap.entrySet().iterator();
	      while(iterator.hasNext()) {
	    	  Map.Entry ent = (Map.Entry)iterator.next();
	    	  System.out.println("key value is " + ent.getKey() + " and value is " + ent.getValue() );
	    	  
		/* 1. void clear(): It removes all the key and value pairs from the specified Map.
		   2. Object clone(): It returns a copy of all the mappings of a map and used for cloning them into another map.
		   3. boolean containsKey(Object key): It is a boolean function which returns true or false based on whether the specified key is found in the map.
		   4. boolean containsValue(Object Value): Similar to containsKey() method, however it looks for the specified value instead of key.
		   5. Value get(Object key): It returns the value for the specified key.
		   6. boolean isEmpty(): It checks whether the map is empty. If there are no key-value mapping present in the map then this function returns true else false.
		   7. Set keySet(): It returns the Set of the keys fetched from the map.
		   8. value put(Key k, Value v): Inserts key value mapping into the map. Used in the above example.
		   9. int size(): Returns the size of the map – Number of key-value mappings.
		   10.Collection values(): It returns a collection of values of map.
		   11.Value remove(Object key): It removes the key-value pair for the specified key. Used in the above example.
		   12.void putAll(Map m): Copies all the elements of a map to the another specified map.*/
			
		}}}
			


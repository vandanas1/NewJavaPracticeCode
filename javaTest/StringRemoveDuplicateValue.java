package com.javaTest;

//import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class StringRemoveDuplicateValue {

	public static void main(String[] args) {
		String string = "vandana";

		char[] chars = string.toCharArray();
		Set<Character> charSet = new LinkedHashSet<Character>();
		for (char c : chars) {
		    charSet.add(c);
		    System.out.println(charSet);
		}

		/*StringBuilder sb = new StringBuilder();
		for (Character character : charSet) {
		    sb.append(character);
		}
		System.out.println(sb.toString());*/
	}

}

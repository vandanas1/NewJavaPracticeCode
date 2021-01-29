package com.javaTest;

public class ReverseString {

	public static void main(String[] args) {
		String s="vandana";
		char[] sArr=s.toCharArray();
		
		for(int i=sArr.length-1;i>=0;i--)
		{
			System.out.print(sArr[i]);
		}
		
		StringBuilder sb=new StringBuilder();
		sb.append(sArr);
		System.out.println();
		System.out.println(sb);
		
		

	}

}

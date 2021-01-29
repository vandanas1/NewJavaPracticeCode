package com.javaTest;

public class SwapTwoNumberWithoutUsingTempVar {

	public static void main(String[] args) {
		int a=2;
		int b=4;
		a=a+b;//6
		b=a-b;//2
		a=a-b;//4
		
		System.out.print("value of a is " +a + " value of b is " +b);

	}

}

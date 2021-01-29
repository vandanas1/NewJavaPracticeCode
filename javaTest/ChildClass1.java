package com.javaTest;

public class ChildClass1 extends ParentClass1 {
	public void test()
	{
		System.out.println("override test2");
	}

	public static void main(String[] args) {
		ChildClass1 c1=new ChildClass1();
		c1.test();

	}

}

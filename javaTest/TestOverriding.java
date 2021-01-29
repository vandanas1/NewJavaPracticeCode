package com.javaTest;

public class TestOverriding extends OverriddingPractice1 {

	void run() {
		System.out.println("Bike is running safely");
	}
	
	void print(){
		System.out.println("Print Hello");
	}

	public static void main(String args[]) {
		TestOverriding obj = new TestOverriding();// creating object
		obj.run();// calling method
		obj.print();
	}
}



				



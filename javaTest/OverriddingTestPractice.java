package com.javaTest;

public class OverriddingTestPractice extends OverriddingPractice1 {

	void run() {
		System.out.println("Bike is running safely");
	}
	
	void print(){
		System.out.println("Print Hello");
	}

	public static void main(String args[]) {
		OverriddingPractice1 obj = new OverriddingTestPractice();// creating object
		obj.run();// calling method
		obj.print();
	}
}

class OverriddingPractice1 {
	void run() {
		System.out.println("Vehicle is running");
	}
	
	void print(){
		System.out.println("Print PArent Class");
	}
}
				



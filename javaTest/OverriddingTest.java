package com.javaTest;

public class OverriddingTest { 
  
  void run(){
	  System.out.println("Vehicle is running");
	  }  
		}  
 
		class Overridding1 extends OverriddingTest{  
		  //defining the same method as in the parent class  
		  void run(){
			  System.out.println("Bike is running safely");
			  }  
		  
		  public static void main(String args[]){  
			  Overridding1 obj = new Overridding1();//creating object  
		  obj.run();//calling method  
		  }  
		}  
		

	



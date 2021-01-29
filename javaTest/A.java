package com.javaTest;

public class A {

	void run(){
		  System.out.println("Vehicle is running");
		  }  
			}  
	 
			class B extends A{  
			  //defining the same method as in the parent class  
			  void run(){
				  System.out.println("Bike is running safely");
				  }  
			  
			  public static void main(String args[]){  
				  B obj = new B();//creating object  
			  obj.run();//calling method  
			  }  
			}  
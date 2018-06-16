package com.java.reflection_api;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

//Class whose object is to be created
class TestTest{
	
	//creating a private field
	private String name;
	
	//Creating a default constructor
	public TestTest(){
		name="Nikhil Sengar";
	}
	
	//creating a public method with no argument
	public void method1() {
		System.out.println("The Name is: "+name);
	}
	
	//creating a public method with int as argument
	public void method2(int n) {
		System.out.println("The number is: "+n);
	}
	
	//creating the private method
	private void method3() {
		System.out.println("Inside the private method.");
	}
}

public class AllMethods_Demo {

	public static void main(String[] args) {
		// creating object whose property is checked
		TestTest tt=new TestTest();
		
		//creating class object from the object using getClass method
		Class c=tt.getClass();
		System.out.println("The name if class is: "+c.getName());
		
		//Getting the constructor of class through the object of the class
		Constructor[] cons=c.getConstructors();
		System.out.println("The name of the constructor is: "+cons);
		
		System.out.println("=====================================================================================");
		System.out.println("The public methods of the class are:");
		
		//getting methods of the class through object of the class
		Method[] m=c.getMethods();
		
		//Printing the methods name
		for(Method m1:m)
			System.out.println(m1.getName());	
		
		
		

	}

}

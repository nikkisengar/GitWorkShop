package com.java.reflection_api;

class Simple{
	
}

public class ForName_Method_Demo {

	public static void main(String[] args) throws Exception {
		/* accept the implementation class name 
		 * and store it in object c*/ 
		Class c=Class.forName("Simple");
		
		// Displaying the value of c
		System.out.println(c.getName());
		

	}

}

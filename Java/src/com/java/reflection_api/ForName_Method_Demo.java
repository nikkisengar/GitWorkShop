package com.java.reflection_api;

class Simple{
	
}

public class ForName_Method_Demo {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		/* accept the implementation class name 
		 * and store it in object c
		 * Used to load the class dynamically
		 * Returns the instance of Class class
		 * Should be used only when you know the fully qualified name of class 
		 * Ex: com.java.reflection_api.Simple
		*/ 
		Class  c=Class.forName("com.java.reflection_api.Simple");
		
		// Displaying the value of c
		System.out.println(c.getName());

	}

}

package com.java.interfaces;

//Main Class
public class InterfaceTest {

	public static void main(String[] args) throws Exception{
		/* accept the implementation class name from 
		 * command line argument and store it in object c*/
		Class c=Class.forName(args[0]);
		
		//Creating the object to the class whose name is in c
		//let the reference variable of interface point to it
		MyInterface mi=(MyInterface)c.newInstance();
		
		//Call the methods of the object using mi
		mi.connect();
		mi.disconnect();
	}

}

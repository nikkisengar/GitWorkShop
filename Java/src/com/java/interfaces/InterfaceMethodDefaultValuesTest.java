package com.java.interfaces;

public class InterfaceMethodDefaultValuesTest {

	public static void main(String[] args) {
		// Creating the Reference of Base class
		Sender s;
		
		//Creating the object of Child class
		s=new Receiver();
		
		//Calling the method
		s.message();

	}

}

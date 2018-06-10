package com.java.abstractclasses;
abstract class Sender{
	
	abstract void message();
}

abstract class Receiver extends Sender{
	
}

class Receiver2 extends Receiver{
	
	void message(){
		System.out.println("Hello, there!");
	}
}

public class AbstractClassCompulsion {

	public static void main(String[] agrs){
		//Creating the reference of Base class
		Sender s;
		
		// Creating the object of child class
		s=new Receiver2();
		
		//Calling the method
		s.message();
	}
}

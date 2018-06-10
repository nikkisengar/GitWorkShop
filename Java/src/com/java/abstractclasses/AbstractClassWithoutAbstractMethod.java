package com.java.abstractclasses;

abstract class Base1{
	
	public void message(){
		System.out.println("This is Non-Abstract method of Base Class.");
	}
}

class Derived1 extends Base1{}

public class AbstractClassWithoutAbstractMethod {

	public static void main(String[] args) {
		// Creating the object of Derived1 Class
		Derived1 d1=new Derived1();
		
		//Calling the method
		d1.message();
	}

}

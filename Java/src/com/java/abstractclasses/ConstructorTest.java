package com.java.abstractclasses;

abstract class Base {
	
	// Super or Base Class constructor
	public Base() {
		System.out.println("Super or Base Class Constructor.");
	}
	
	//abstract method
	abstract void message();
}

class Derived extends Base{
	
	//Derived or Child class constructor
	public Derived(){
		System.out.println("Derived or Child class Constructor.");
	}
	
	//implementing the Base class abstract method
	void message(){
		System.out.println("Hi, there!");
	}
}

public class ConstructorTest{
	
	public static void main(String[] args){
		//creating object of derived class or child class
		Derived d=new Derived();
		
		//calling the abstract method
		d.message();
	}
}




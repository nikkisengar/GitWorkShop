package com.java.abstractclasses;

class Rectangle extends Shape{
	
	//Implementing the abstract methods in superclass
	
	//Declaring the variables
	int lenght, weidth;
	
	//Constructor
	Rectangle(int length, int weidth,String name) {
		
		super(name);
		this.lenght=length;
		this.weidth=weidth;
	}
	
	//Implementing the abstract methods
	public void draw(){
		System.out.println("Rectangle has been drawn.");
	}
	
	public double area(){
		return (double)(lenght*weidth);
	}
}

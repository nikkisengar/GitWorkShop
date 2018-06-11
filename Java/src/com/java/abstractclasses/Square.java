package com.java.abstractclasses;

public class Square extends Shape{
	
	//Declaring the variable
	int side;
	
	//Constructor to print the shape
	Square(int side, String name) {
		
		super(name);
		this.side=side;		
	}
	
	//Implementing the abstract methods
	public void draw(){
		System.out.println("Square has been drawn.");
	}
	
	public double area(){
		return (double)(side*side);
	}
}

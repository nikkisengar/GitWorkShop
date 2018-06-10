package com.java.abstractclasses;

//Super class Shape which contains abstract and non-abstract methods
abstract class Shape {
	
	//Declaring variable
	String name;
	
	//Constructor if super class
	Shape(String name){
		this.name=name;
		System.out.println("Constractor in Super class.");
	}
	
	//Declaring the non-abstract methods which has default implementation
	
	public void moveTo(int x, int y){
		System.out.println(this.name+" has been moved to "+" x= "+x+" and y= "+y);
	}
	
	//Declaring the abstract method which will be implemented by its sub class or classes.
	abstract public double area();
	abstract public void draw();
}

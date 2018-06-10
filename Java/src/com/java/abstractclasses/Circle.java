package com.java.abstractclasses;

class Circle extends Shape{
	
	//Declaring the variables
	double pi=3.14;
	int radiu;
	
	//Constructor
	public Circle(int radius, String name) {
		super(name);
		this.radiu=radius;
	}
	
	//Implementing the abstract methods
	public void draw(){
		System.out.println("Circle has been drawn");
	}
	
	//Calculating the area of circle
	public double area(){
		return (double)(pi*radiu*radiu);
	}

}

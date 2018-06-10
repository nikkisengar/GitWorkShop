package com.java.abstractclasses;

//Main class to chosse the Shape
public class ShapeTest {

	public static void main(String[] args) {
		// creating the object of Rectangle class using Shape class reference
		Shape sRec=new Rectangle(2,3,"Rectangle");
		System.out.println("Area of Rectangle is: "+sRec.area());
		sRec.moveTo(1, 4);
		
		System.out.println(" ");
		
		// creating the object of Circle class using Shape class reference
		Shape sCir=new Circle(2,"Circle");
		System.out.println("Area of Circle is: "+sCir.area());
		sCir.moveTo(2, 4);


	}

}

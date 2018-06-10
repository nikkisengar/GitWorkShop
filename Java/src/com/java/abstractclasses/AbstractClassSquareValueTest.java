package com.java.abstractclasses;

//Class to calculate Square
class AbstractClassSquareValueTest extends AbstractClassDeclaration{

	//Using the Abstract method calculate() according to square functionality
	void calculate(double givenInputValue){
		
		System.out.println("Square of "+givenInputValue+" is: "+(givenInputValue*givenInputValue));
		
	}
}

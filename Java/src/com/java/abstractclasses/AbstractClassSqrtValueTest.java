package com.java.abstractclasses;

//Class to calculate Square root
class AbstractClassSqrtValueTest extends AbstractClassDeclaration{
	
	//Using the Abstract method calculate() according to square root functionality
	void calculate(double givenInputValue){
		System.out.println("Square Root of "+givenInputValue+" is: "+Math.sqrt(givenInputValue));
	}

}

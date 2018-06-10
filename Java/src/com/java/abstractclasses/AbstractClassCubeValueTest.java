package com.java.abstractclasses;

//Class to calculate Cube
class AbstractClassCubeValueTest extends AbstractClassDeclaration{
	
	//Using the Abstract method calculate() according to cube functionality
	void calculate(double giveInputValue){
		
		System.out.println("Cube of "+giveInputValue+" is: "+(giveInputValue*giveInputValue*giveInputValue));
	}
}

package com.java.abstractclasses;

//Main class where we are creating the objects of sub class
public class AbstractClassMainTest {

	//Main method
	public static void main(String[] args) {
		// Creating the object of AbstractClassSquareValueTest
		AbstractClassSquareValueTest absqre=new AbstractClassSquareValueTest();
		
		// Creating the object of AbstractClassSqrtValueTest
		AbstractClassSqrtValueTest absqrt=new AbstractClassSqrtValueTest();
		
		// Creating the object of AbstractClassCubeValueTest
		AbstractClassCubeValueTest abcube=new AbstractClassCubeValueTest();
		
		/*//Creating the reference of AbstractClassdeclaration,
		 * in order to force the programmer to use only those methods
		 *  which are declare in the Abstract class*/
		AbstractClassDeclaration abdec;
		
			//Assigning the AbstractClassSquareValueTest reference to abdec
			abdec=absqre;
			
			/*//Assigning the AbstractClassSquareValueTest reference to abdec
			abdec=absqrt;
			
			//Assigning the AbstractClassSquareValueTest reference to abdec
			abdec=abcube;*/
		
		//Calling the calculate function according to functionality
		abdec.calculate(10);
		
		absqrt.calculate(16);
		
		abcube.calculate(5);
		

	}

}

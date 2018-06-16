package com.java.reflection_api;

class Test{
	
}

public class GetClassMethod_Demo {

	public void printClass(Object obj) {
		
		/*It returns the instance of Class class.
		 * Should be used when you know the type
		*/
		Class c=obj.getClass();
		
		System.out.println(c.getName());
	}
	
	public static void main(String[] args) throws Exception{
		
		//Creating the object of Test class
		Test t=new Test();
		
		//Creating the object of GetClassMethod_Demo
		GetClassMethod_Demo get=new GetClassMethod_Demo();
		
		//Invoking the method
		get.printClass(t);
		
		

	}

}

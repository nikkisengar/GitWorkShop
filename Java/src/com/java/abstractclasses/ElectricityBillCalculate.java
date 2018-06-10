package com.java.abstractclasses;

//Main Class which is calculating the electricity bill according to plans
public class ElectricityBillCalculate {

	public static void main(String[] args) {
		/* creating the reference of AbstractClassPlan class */
		AbstractClassPlan p;
		
		//Calculate the commercial bill for 250 units
		System.out.println("Commercial Connection: ");
		
		//objects of CommercialPlan class
		p=new CommercialPlan();	//Using the reference of super class to refer to sub class
		
		//Calling the methods
		p.getRate();
		p.calculateBill(250);
		
		//Calculate the domestic bill for 150 units
		System.out.println("Domestic Connection: ");
		
		//object of DomesticPlan Class
		p=new DomesticPlan();	//Using the reference of super class to refer to sub class
		
		//Calling the methods
		p.getRate();
		p.calculateBill(150);
		//Creating the 

	}

}

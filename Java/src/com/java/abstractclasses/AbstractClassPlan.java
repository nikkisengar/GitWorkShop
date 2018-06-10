package com.java.abstractclasses;

//Calculating electricity bill for Commercial and domestic plans
abstract class AbstractClassPlan {
	
	//taking rate variable as protected to access it in sub classes
	protected double rate;
	
	//Accept the rate into rate variable, since rate will change depending on the plan
	public abstract void getRate();
	
	//Calculate the electricity bill by taking units
	public void calculateBill(int units){
		System.out.print("Bill amount for "+units+" units: \nRs. ");
		System.out.println(rate*units);
	}
}

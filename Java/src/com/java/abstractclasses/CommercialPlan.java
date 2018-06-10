package com.java.abstractclasses;

//Sub Class to calculate the electricity bill of Commercial plan
class CommercialPlan extends AbstractClassPlan{
	
	//store commercial plan rare as Rs. 5.00 per unit
	public void getRate(){
		rate=5.00;	//rate variable is declared in AbstractClassPlan as protected variable
	}
}

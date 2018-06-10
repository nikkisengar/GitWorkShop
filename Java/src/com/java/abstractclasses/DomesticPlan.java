package com.java.abstractclasses;

//Sub Class to calculate the electricity bill of domestic plan
class DomesticPlan extends AbstractClassPlan{
	
	//store domestic rate as Rs.2.60 per unit
	public void getRate(){
		rate=2.60;	//rate variable is declared in AbstractClassPlan as protected variable
	}
}

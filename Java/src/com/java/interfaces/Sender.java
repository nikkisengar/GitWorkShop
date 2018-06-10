package com.java.interfaces;

interface Sender {
	
	//Method declaration in the interface
	void message();
}

class Receiver implements Sender{
	public void message(){
		
		System.out.println("Hello, World!");
	}
}

package com.java.interfaces;

class SybaseDB implements MyInterface{
	
	//implementing the interface methods
	public void connect(){
		System.out.println("Connecting to Sybase Database...");
	}
	
	public void disconnect(){
		System.out.println("Disconnecting from Sybase Database...");
	}

}

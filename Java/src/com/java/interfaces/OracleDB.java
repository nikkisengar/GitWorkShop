package com.java.interfaces;

class OracleDB implements MyInterface{

	//implementing the interface methods
	public void connect(){
		System.out.println("Connecting to Oracle Database...");
	}
	
	public void disconnect(){
		System.out.println("Disconnecting from Oracle Database...");
	}
}

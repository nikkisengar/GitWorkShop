package com.java.interfaces;

//Interface to connect/disconnect to database
public interface MyInterface {
	
	//methods in interface are by default "public abstract"
	void connect();
	
	void disconnect();
}
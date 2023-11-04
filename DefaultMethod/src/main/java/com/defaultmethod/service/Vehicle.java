package com.defaultmethod.service;

public interface Vehicle {

	public void start();
	public default void clean()
	{
		System.out.println("Vehicle default method executed");
	}
	
}

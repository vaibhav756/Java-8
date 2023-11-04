package com.staticmethod.service;

public interface Vehicle {

	public void start();
	public static void clean()
	{
		System.out.println("Vehicle interface clean method executed.");
	}
	
}

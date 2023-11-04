package com.staticmethod.service.impl;

import com.staticmethod.service.Vehicle;

public class Car implements Vehicle{

	public static void main(String[] args) {

		Car c=new Car();
		c.start();
		Vehicle.clean();
		
	}

	@Override
	public void start() {
		System.out.println("Car class start method executed.");
	}
	
	//Not allowed to override static method of an interface
	/*@Override
	public static void clean()
	{
		System.out.println("Clean method executed.");
	}*/
	

}

package com.defaultmethod.service.impl;

import com.defaultmethod.service.Vehicle;

public class Car implements Vehicle{

	public static void main(String[] args) {
		Car c=new Car();
		c.start();
		c.clean();
	}

	@Override
	public void start() {
		System.out.println("Car started.");
	}
	//Default method overriden
	@Override
	public void clean()
	{
		System.out.println("Car class default method executed.");
	}

}

package com.methodreference;
public class StaticMethodReference {

	public static void m2()
	{
		System.out.println("Static M2 method called.");
	}
	
	public static void main(String[] args) {
		MyInterface mi=StaticMethodReference::m2;
		mi.m1();
	}

}

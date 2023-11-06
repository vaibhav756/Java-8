package com.methodreference;

interface MyInterface
{
	public void m1();
}
public class MethodRef implements MyInterface{

	public static void m2()
	{
		System.out.println("M2 method called.");
	}
	
	public static void main(String[] args) {
		MyInterface mi=MethodRef::m2;
		mi.m1();
	}

	@Override
	public void m1() {
		
	}

}

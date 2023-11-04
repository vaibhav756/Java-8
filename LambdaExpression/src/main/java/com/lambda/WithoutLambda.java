package com.lambda;

interface MyInterfaceOne
{
	public void m1();
}

public class WithoutLambda implements MyInterfaceOne{

	public static void main(String[] args) {

		WithoutLambda mao=new WithoutLambda();
		mao.m1();
		
	}

	@Override
	public void m1() {
		System.out.println("M1 method called.");
	}
}

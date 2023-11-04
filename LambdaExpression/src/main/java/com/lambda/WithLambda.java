package com.lambda;

public class WithLambda {

	public static void main(String[] args) {
		
		MyInterfaceOne run=()->{
			System.out.println("Lambda Expression executed.");
		};
		run.m1();
	}

}

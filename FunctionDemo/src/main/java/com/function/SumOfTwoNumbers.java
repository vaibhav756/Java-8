package com.function;

import java.util.function.BiFunction;

public class SumOfTwoNumbers {

	public static void main(String[] args) {
		BiFunction<Integer,Integer,Integer> biFun=(a,b)->a+b;
		System.out.println(biFun.apply(10,20));
	}

}

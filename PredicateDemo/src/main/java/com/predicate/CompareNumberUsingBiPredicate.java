package com.predicate;

import java.util.function.BiPredicate;

public class CompareNumberUsingBiPredicate {

	public static void main(String[] args) {

		BiPredicate<Integer,Integer> biPred=(a,b)->a>b;
		System.out.println(biPred.test(300, 200));
		
	}

}

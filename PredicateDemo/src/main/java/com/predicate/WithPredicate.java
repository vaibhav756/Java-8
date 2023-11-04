package com.predicate;

import java.util.function.Predicate;

public class WithPredicate {

	public static void main(String[] args) {

		Predicate<Integer> pre=(val)->{ return val>10;};
		System.out.println(pre.test(7));
	}
}

package com.predicate;

public class WithoutPredicate {

	public boolean test(int i)
	{
		if(i>10)
		return true;
		else
		return false;
	}
	
	public static void main(String[] args) {

		WithoutPredicate wp=new WithoutPredicate();
		System.out.println(wp.test(9));
		
	}

}

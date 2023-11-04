package com.predicate;

import java.util.function.Predicate;

public class PrintNamesWithCondition {

	public static void main(String[] args) {

		Predicate<String> pred=(name)->{
			return name.startsWith("A");
		};
		String[] names= {"Vaibhav","Amit","Ketan","Rahul","Kiran","Rohan"};
		for(String name:names)
		{
			if(pred.test(name))
			System.out.println(name+" starts with letter 'A'.");
		}
		
	}

}

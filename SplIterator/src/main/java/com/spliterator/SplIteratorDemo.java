package com.spliterator;

import java.util.Arrays;
import java.util.List;

public class SplIteratorDemo {

	public static void main(String[] args) {

		List<String> list=Arrays.asList("Vaibhav","Rohan","Ketan","Piyush");
		list.stream().spliterator().forEachRemaining(i->System.out.println(i));
		
	}

}

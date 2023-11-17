package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {

		//Approach-1
		Stream<Integer> st=Stream.of(10,20,45,78,95);
		//st.forEach(i->System.out.println(i));
		st.filter(i->i%2!=0).forEach(i->System.out.println(i));

		//Approach-2
		List<String> names=new ArrayList<>();
		names.add("Vaibhav");
		names.add("Ketan");
		names.add("Amit");
		names.add("Rohan");
		names.add("Piyush");
		
		names.stream().filter(name->!name.startsWith("A")).forEach(i->System.out.println(i));
	}

}

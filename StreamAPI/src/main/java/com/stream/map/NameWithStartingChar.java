package com.stream.map;

import java.util.Arrays;
import java.util.List;

public class NameWithStartingChar {

	public static void main(String[] args) {

		List<String> list=Arrays.asList("Vaibhav","Ketan","Amit","Rohan","Amay");
		list.stream().filter(name->name.startsWith("A")).forEach(name->System.out.println(name+" "+name.length()));
		
	}

}

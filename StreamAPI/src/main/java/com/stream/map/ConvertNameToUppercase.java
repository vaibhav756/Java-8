package com.stream.map;

import java.util.Arrays;
import java.util.List;

public class ConvertNameToUppercase {

	public static void main(String[] args) {

		List<String> list=Arrays.asList("vaibhav","ketan","amit","rohan","kiran");
		list.stream().map(name->name.toUpperCase()).forEach(name->System.out.println(name));
	}

}

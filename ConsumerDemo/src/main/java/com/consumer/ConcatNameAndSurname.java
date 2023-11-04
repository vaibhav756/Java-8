package com.consumer;

import java.util.function.BiConsumer;

public class ConcatNameAndSurname {

	public static void main(String[] args) {

		BiConsumer<String,String> biCons=(name,surname)-> System.out.println(name+" "+surname);
		biCons.accept("Vaibhav","Yadav");
	}

}

package com.stream.slicing;

import java.util.Arrays;
import java.util.List;

public class SlicingOperation {

	public static void main(String[] args) {

		List<String> list=Arrays.asList("Core Java","Adv Java","Hibernate","Spring","SpringBoot","Microservices","Core Java","Adv Java");
		//Find first 3 courses
		list.stream().limit(3).forEach(course->System.out.println(course));
		System.out.println("=================================================");
		//Give element starting from position 4
		list.stream().skip(3).forEach(course->System.out.println(course));
		System.out.println("=================================================");		
		//Find Distinct Courses
		list.stream().distinct().forEach(course->System.out.println(course));
		
		
	}

}

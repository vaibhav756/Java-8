package com.stream.flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMap {

	public static void main(String[] args) {

		List<String> javacourse=Arrays.asList("Core java","Advanced Java","Spring","Spring Boot");
		List<String> uicourse=Arrays.asList("HTML","Css","Javascript");
		List<List<String>> list = Arrays.asList(javacourse,uicourse);
		
		list.stream().forEach(lst->System.out.println(lst));
		Stream<String> flatMap = list.stream().flatMap(lst->lst.stream());
		flatMap.forEach(course->System.out.println(course));
	}

}

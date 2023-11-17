package com.stream.aggregation;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByFunction {

	public static void main(String[] args) {

		Employee e1=new Employee(101,"Vaibhav",20000.00,"India");
		Employee e2=new Employee(102,"Ketan",65000.00,"USA");
		Employee e3=new Employee(103,"Amit",55000.00,"UK");
		Employee e4=new Employee(104,"Piyush",135000.00,"Canada");
		Employee e5=new Employee(105,"Rohit",8000.00,"Brazil");
		Employee e6=new Employee(106,"Kiran",12000.00,"India");
		
		List<Employee> list = Arrays.asList(e1,e2,e3,e4,e5,e6);
		Map<String, List<Employee>> data = list.stream().collect(Collectors.groupingBy(emp->emp.empCountry));
		System.out.println(data);
		
		
	}

}
package com.faq;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.util.comparator.Comparators;

import com.faq.dto.Employee;

public class Main {

	public static void main(String[] args) {

		List<Employee> list=new ArrayList<Employee>();
		list.add(new Employee(101,"Vaibhav",27,"Male","Java Developer",1996,25000.00));
		list.add(new Employee(102,"Rohan",27,"Male","CA",1996,45000.00));
		list.add(new Employee(103,"Ketan",26,"Male","Accountant",1997,20000.00));
		list.add(new Employee(104,"Omkar",29,"Male","Diamond Assort",1995,25000.00));
		list.add(new Employee(105,"Komal",25,"Female","HR",1998,50000.00));
		list.add(new Employee(106,"Priya",24,"Female","Data Analyst",1998,25000.00));
		list.add(new Employee(107,"Kiram",23,"Female","HR",2000,30000.00));
		list.add(new Employee(108,"Shruti",26,"Female","Accountant",1996,35000.00));
		list.add(new Employee(109,"Roshni",27,"Female","Sister",1996,25000.00));
		list.add(new Employee(110,"Shweta",27,"Female","Food Department",1996,15000.00));
		
		//Find Female Employees
		List<Employee> femaleEmps = list.stream().filter(emp->emp.getGender().equals("Female")).collect(Collectors.toList());
		//System.out.println(femaleEmps);
		
		//Find Number of Male and Female Employees in organization
		Map<String, Long> genderAndCount = list.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
		System.out.println(genderAndCount);
		//Find List of Departments
		List<String> listOfDept = list.stream().map(emp->emp.getDepartment()).distinct().collect(Collectors.toList());
		//System.out.println(listOfDept);
		
		//Find Avg age of Male and Female employees
		Double avgFemaleAge = list.stream().filter(emp->emp.getGender().equals("Female")).collect(Collectors.averagingDouble(emp->emp.getAge()));
		//System.out.println("Average female age : "+avgFemaleAge);
		Map<String, Double> avgMaleFemaleAge = list.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge)));
		//System.out.println(avgMaleFemaleAge);
		
		//Find Avg age of Male and Female employees
		Double avgMaleAge = list.stream().filter(emp->emp.getGender().equals("Male")).collect(Collectors.averagingDouble(emp->emp.getAge()));
		//System.out.println("Average male age : "+avgMaleAge);
		
		//Find Highest paid employee
		Optional<Employee> highestSalEmp = list.stream().collect(Collectors.maxBy(Comparator.comparing(emp->emp.getSalary())));
		System.out.println(highestSalEmp.get());
		
		Optional<Employee> collect = list.stream().collect(Collectors.minBy((emp1,emp2)->(int)emp1.getSalary()));
		//System.out.println(collect.get());
		
		//Get employees born after 1996
		List<Employee> empGreaterThanNineSix = list.stream().filter(emp->emp.getYearOfJoining()>1996).collect(Collectors.toList());
		//System.out.println(empGreaterThanNineSix);
		
		//Count employee from each department
		Map<String, List<Employee>> groupByDept = list.stream().collect(Collectors.groupingBy(emp->emp.getDepartment()));
		Set<String> keySet = groupByDept.keySet();
		for(String set:keySet)
		{
			System.out.println(set+" - "+groupByDept.get(set).size());
		}
		
		Map<String, Long> grpByDepartments = list.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
		System.out.println("Employee count per department : "+grpByDepartments);
		//Count Avg salary from Each Department
		Map<String, List<Employee>> grpByDept = list.stream().collect(Collectors.groupingBy(emp->emp.getDepartment()));
		Set<String> key=grpByDept.keySet();
		for(String keys:key)
		{
			List<Employee> empList = grpByDept.get(keys);
			Double deptAvgSal = empList.stream().collect(Collectors.averagingDouble(emp->emp.getSalary()));
			System.out.println("Department : "+keys+" AvgSalary : "+deptAvgSal);
		}
		
		Map<String, Double> deptWiseSal = list.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
		System.out.println("Department wise average salary : "+deptWiseSal);
		
		//Get details of youngest emp working in Accountant department
		Optional<Employee> youngestEmpInAccountDept = list.stream().filter(emp->emp.getDepartment().equals("Accountant")).collect(Collectors.minBy(Comparator.comparing(emp->emp.getAge())));
		System.out.println("Youngest Employee in Account Department : "+youngestEmpInAccountDept.get());
		
		//Find most working experience employee in organization
		Optional<Employee> highestExpEmp = list.stream().collect(Collectors.maxBy(Comparator.comparing(emp->emp.getAge())));
		System.out.println(highestExpEmp.get());
		
		//How many male and female employees are there in Accountant and HR departement
		Map<String, List<Employee>> collect3 = list.stream().filter(emp->(emp.getDepartment().equals("HR") || emp.getDepartment().equals("Accountant"))).collect(Collectors.groupingBy(emp->emp.getGender()));
		Set<String> set=collect3.keySet();
		for(String keys:set)
		{
			System.out.println(keys+" - "+collect3.get(keys).size());
		}
		
		Map<String, Long> countPerGender = list.stream().filter(emp->emp.getDepartment().equals("Accountant") || emp.getDepartment().equals("HR")).collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
		System.out.println(countPerGender);
		
		//Avg salary of male and female employee
		Map<String, List<Employee>> grpByGender = list.stream().collect(Collectors.groupingBy(emp->emp.getGender()));
		Set<String> avgByGenderKeys = grpByGender.keySet();
		for(String keys:avgByGenderKeys)
		{
			List<Employee> listOfGenderEmp=grpByGender.get(keys);
			Double collect2 = listOfGenderEmp.stream().collect(Collectors.averagingDouble(emp->emp.getSalary()));
			System.out.println(keys+" Avg Salary "+collect2);
		}
		Map<String, Double> avgSalPerGender = list.stream().collect(Collectors.groupingBy(emp->emp.getGender(),Collectors.averagingDouble(emp->emp.getSalary())));
		//System.out.println(avgSalPerGender);
		//List down name of all employees in each department
		
		//Map<String, List<Employee>> grpByDept = list.stream().collect(Collectors.groupingBy(emp->emp.getDepartment()));
		Set<String> dept = grpByDept.keySet();
		for(String depts:dept)
		{
			List<Employee> grpByDepts=grpByDept.get(depts);
			System.out.print(depts+" - ");
			grpByDepts.stream().map(emp->emp.getName()).forEach(name->System.out.print(name+" "));
			System.out.println();
		}
		
		//What is average salary and whole salary of organization
		/*Double avgOrgSalary = list.stream().collect(Collectors.averagingDouble(emp->emp.getSalary()));
		System.out.println("Average organization salary : "+avgOrgSalary);
		Double sal=0.0;		
		Optional<Double> findFirst = list.stream().map((emp)->
		{
			sal=sal+emp.getSalary();
			return sal;
		}).findFirst();
		System.out.println("Total Organization salary : "+findFirst);*/
		
		//Session - 10
		//Find 2nd highest salary employee
		Collections.sort(list,(e1,e2)->{
			int result=0;
			if(e1.getSalary()>e2.getSalary())
				result=-1;
			else if(e1.getSalary()<e2.getSalary())
				result=1;
			else
				result=0;
			return result;
		});
		Optional<Employee> emp = list.stream().skip(1).findFirst();
		System.out.println(emp.get());

		Optional<Employee> secondHighSalEmp = list.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1).findFirst();
		System.out.println(secondHighSalEmp.get());
		
		//Find sum of array
		int[] nums= {45,78,96,45,25,32};
		int sum = Arrays.stream(nums).reduce(0,(a,b)->a+b);
		System.out.println("Sum of array numbers : "+sum);
	}

}

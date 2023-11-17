package com.stream.aggregation;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import ch.qos.logback.core.net.SyslogOutputStream;

public class AggregationFunction {

	public static void main(String[] args) {

		Employee e1=new Employee(101,"Vaibhav",20000.00,"India");
		Employee e2=new Employee(102,"Ketan",65000.00,"USA");
		Employee e3=new Employee(103,"Amit",55000.00,"UK");
		Employee e4=new Employee(104,"Piyush",135000.00,"Canada");
		Employee e5=new Employee(105,"Rohit",8000.00,"Brazil");

		List<Employee> list = Arrays.asList(e1,e2,e3,e4,e5);
		Optional<Employee> max = list.stream().collect(Collectors.maxBy(Comparator.comparing(e->e.getEmpSal())));
		if(max.isPresent())
		System.out.println(max.get());
		
		Optional<Employee> min = list.stream().collect(Collectors.minBy(Comparator.comparing(e->e.getEmpSal())));
		if(min.isPresent())
		System.out.println(min.get());
		
		/*Optional<Employee> collect2 = list.stream().collect(Collectors.maxBy((x1,x2)->x1.getEmpSal().compareTo(x2.getEmpSal())<=0?-1:1));
		if(collect2.isPresent())
		System.out.println(collect2.get());
		
		Optional<Employee> collect3 = list.stream().collect(Collectors.minBy((x1,x2)->x1.getEmpSal().compareTo(x2.getEmpSal())<=0?-1:1));
		if(collect3.isPresent())
		System.out.println(collect3.get());*/
		
		/*Optional<Employee> collect = list.stream().collect(Collectors.maxBy((Employee emp1,Employee emp2)->emp1.getEmpSal().compareTo(emp2.getEmpSal()));
		System.out.println(collect.get());*/
		
		Double avgsal = list.stream().collect(Collectors.averagingDouble(e->e.getEmpSal()));
		System.out.println("Average salary is : "+avgsal);
		
	}

}
class Employee
{
	Integer empId;
	String empName;
	Double empSal;
	String empCountry;
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Double getEmpSal() {
		return empSal;
	}
	public void setEmpSal(Double empSal) {
		this.empSal = empSal;
	}
	public String getEmpCountry() {
		return empCountry;
	}
	public void setEmpCountry(String empCountry) {
		this.empCountry = empCountry;
	}
	public Employee(Integer empId, String empName, Double empSal, String empCountry) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		this.empCountry = empCountry;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + ", empCountry=" + empCountry
				+ "]";
	}
}
package com.stream.map;

import java.util.Arrays;
import java.util.List;

public class GetEmpOnSalary {

	public static void main(String[] args) {

		Employee e1=new Employee(101,"Vaibhav",20000.00);
		Employee e2=new Employee(102,"Ketan",65000.00);
		Employee e3=new Employee(103,"Amit",55000.00);
		Employee e4=new Employee(104,"Piyush",135000.00);
		Employee e5=new Employee(105,"Rohit",8000.00);
		
		List<Employee> list=Arrays.asList(e1,e2,e3,e4,e5);
		//list.stream().filter(emp->emp.getEmpSal()>50000).forEach(emp->System.out.println(emp.getEmpId()+" - "+emp.getEmpName()));
		list.stream().filter(emp->emp.getEmpSal()>50000.00).map(emp->emp.getEmpId()+" - "+emp.getEmpName()).forEach(emp->System.out.println(emp));
		
	}

}
class Employee
{
	Integer empId;
	String empName;
	Double empSal;
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
	public Employee(Integer empId, String empName, Double empSal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + "]";
	}
}
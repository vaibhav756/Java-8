package com.stream.collectors;

import java.util.Arrays;
import java.util.List;
import java.util.stream.*;
public class CollectorsInStream {

	public static void main(String[] args) {

		Person p1=new Person("John","USA");
		Person p2=new Person("Steave","Japan");
		Person p3=new Person("Vaibhav","India");
		Person p4=new Person("Johny","Dubai");
		Person p5=new Person("Pranay","Brazil");
		
		List<Person> list = Arrays.asList(p1,p2,p3,p4,p5);
		List<Person> listOfPerson = list.stream().filter(p->p.getCountry().equals("India")).collect(Collectors.toList());
		listOfPerson.forEach(p->System.out.println(p));
		
		List<String> listOfNames = list.stream().filter(p->p.getCountry().equals("India")).map(p->p.getName()).collect(Collectors.toList());
		listOfNames.forEach(name->System.out.println(name+" belongs to India."));
		
	}
}
class Person
{
	String name;
	String country;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Person(String name, String country) {
		super();
		this.name = name;
		this.country = country;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", country=" + country + "]";
	}
}
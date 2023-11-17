package com.stream.match;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MatchingOperation {

	public static void main(String[] args) {

		Person p1=new Person("John","USA");
		Person p2=new Person("Steave","Japan");
		Person p3=new Person("Vaibhav","India");
		Person p4=new Person("Johny","Dubai");
		Person p5=new Person("Pranay","Brazil");
		
		List<Person> persons = Arrays.asList(p1,p2,p3,p4,p5);
		boolean status1 = persons.stream().anyMatch(p->p.getCountry().equals("India"));
		System.out.println("Is any person from India? "+status1);
		
		boolean status2 = persons.stream().allMatch(p->p.getCountry().equals("India"));
		System.out.println("Is all person from India? "+status2);
		
		boolean status3 = persons.stream().noneMatch(p->p.getCountry().equals("India"));
		System.out.println("Is none of them from India? "+status3);
		
		Optional<Person> firstperson = persons.stream().filter(p->p.getCountry().equals("India")).findFirst();
		if(firstperson.isPresent())
		{
			System.out.println(firstperson.get());
		}
		
		Optional<Person> findAny = persons.stream().filter(p->p.getCountry().equals("India")).findAny();
		
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
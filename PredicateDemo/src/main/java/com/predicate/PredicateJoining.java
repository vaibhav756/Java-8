package com.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateJoining {

	public static void main(String[] args) {
		Person p1=new Person("Vaibhav",27);
		Person p2=new Person("Krisha",12);
		Person p3=new Person("Kiran",35);
		Person p4=new Person("Rohan",27);
		Person p5=new Person("Ansh",7);
		Person p6=new Person("Harshita",5);
		
		List<Person> list=Arrays.asList(p1,p2,p3,p4,p5,p6);
		Predicate<Person> pred1=(p)->{
			return p.getAge()>=10;
		};
		Predicate<Person> pred2=(p)->
		{
			return p.getName().startsWith("K");
		};
		
		//Predicate Joining
		//Predicate<Person> pred3 = pred1.and(pred2);
		Predicate<Person> pred3=pred1.or(pred2);
		for(Person p:list)
		{
			if(pred3.test(p))
			{
				System.out.println(p);
			}
		}
	}

}

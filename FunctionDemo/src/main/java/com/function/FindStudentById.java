package com.function;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class FindStudentById {

	public static void main(String[] args) {

		Student s1=new Student(101,"Vaibhav");
		Student s2=new Student(102,"Rohan");
		Student s3=new Student(103,"Ketan");
		Student s4=new Student(104,"Amit");
		Student s5=new Student(105,"Pritam");
		List<Student> list = Arrays.asList(s1,s2,s3,s4,s5);
		Function<Integer,Optional<Student>> fun=(id)->{
			for(Student st:list)
			{
				if(st.getId()==id)
				{
					return Optional.ofNullable(st);
				}
			}
			return Optional.ofNullable(null);
		};
		System.out.println(fun.apply(104).get());
		
	}

}

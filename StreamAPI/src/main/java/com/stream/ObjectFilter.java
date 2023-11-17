package com.stream;

import java.util.Arrays;
import java.util.List;

public class ObjectFilter {

	public static void main(String[] args) {

		User u1=new User(27,"Vaibhav");
		User u2=new User(35,"Kiran");
		User u3=new User(7,"Krisha");
		User u4=new User(15,"Piyush");
		User u5=new User(45,"Sanjay");
		
		List<User> list=Arrays.asList(u1,u2,u3,u4,u5);
		list.stream().filter(u->u.getAge()>18).forEach(obj->System.out.println(obj));
	}

}
class User
{
	Integer age;
	String name;
	public User(Integer age,String name)
	{
		this.age=age;
		this.name=name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String toString()
	{
		return this.age+" - "+this.name;
	}
}
package com.optional;

import java.util.Optional;
import java.util.Scanner;

public class MessageService {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter user id");
		int id=sc.nextInt();
		User u=new User();
		Optional<String> name = u.getUsernameById(id);
		if(name.isPresent())
		{
			System.out.println(name.get().toUpperCase());
		}
		else
		{
			System.out.println("Not present");
		}
	}
}

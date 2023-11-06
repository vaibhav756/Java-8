package com.constructorreference;

import java.util.function.Supplier;

public class Test {

	public static void main(String[] args) {
		//Old approach
		//Doctor d=new Doctor();
		Supplier<Doctor> sup=Doctor::new;
		Doctor doctor = sup.get();
		System.out.println(doctor.hashCode());
	}
}
class Doctor
{
	public Doctor()
	{
		System.out.println("Doctor class constructor executed.");
	}
}

package com.supplier;

import java.util.function.Supplier;

public class GenerateOTP {

	public static void main(String[] args) {

		Supplier<String> sup=()->
		{
			String otp="";
			for(int i=0;i<6;i++)
			{
				otp=otp+String.valueOf((int)(Math.random()*10));
			}
			return otp;
		};
		System.out.println("Generated OTP : "+sup.get());
		System.out.println("Generated OTP : "+sup.get());
		System.out.println("Generated OTP : "+sup.get());
		System.out.println("Generated OTP : "+sup.get());
		System.out.println("Generated OTP : "+sup.get());
	}
}

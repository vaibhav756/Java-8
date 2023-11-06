package com.joiner;

import java.util.StringJoiner;

public class StringJoinerDemo {

	public static void main(String[] args) {
		StringJoiner sj=new StringJoiner(" ");
		sj.add("Vaibhav");
		sj.add("Yadav");
		System.out.println(sj);
		
		StringJoiner sj1=new StringJoiner(" ","(",")");
		sj1.add("Kiran");
		sj1.add("Yadav");
		System.out.println(sj1);
	}

}

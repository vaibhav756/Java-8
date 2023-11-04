package com.consumer;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {

		Consumer<String> cons=(name)->{
			if(LocalTime.now().getHour()<=12)
			System.out.println(name+", Good Morning");
			else if(LocalTime.now().getHour()>12 && LocalTime.now().getHour()<=21)
			System.out.println(name+", Good Evening");
			else
			System.out.println(name+", Good Night");
		};
		cons.accept("Vaibhav Yadav");
	}
}

package com.datetime;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.util.Date;

public class DateTimeApi {

	public static void main(String[] args) throws Exception {

		Date d=new Date();
		System.out.println(d);
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(d)+" "+LocalDate.now());
		String date=sdf.format(d);
		
		
		
		SimpleDateFormat sdf2=new SimpleDateFormat("yyyy-MM-dd");
		Date parse = sdf2.parse(date);
		System.out.println(parse);
		
		SimpleDateFormat sdf3=new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf3.format(parse));

		//java.util.Date
		Date d1=new Date();
		System.out.println(d1);

		//java.sql.Date
/*		Date d2=new Date(1234567889);
		System.out.println(d2);*/
		
		/*SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		String format = sdf.format(d);
		System.out.println(format);
		
		SimpleDateFormat sdf1=new SimpleDateFormat("MM/dd/yyyy");
		String format1 = sdf1.format(d);
		System.out.println(format1);
		
		SimpleDateFormat sdf2=new SimpleDateFormat("yyyy-MM-dd");
		Date date = sdf2.parse(format1);
		System.out.println(date);*/
		
		System.out.println("====================");
		
		//Local Date class
		LocalDate ld=LocalDate.now();
		System.out.println(ld);
		/*System.out.println(ld.plusDays(1));
		System.out.println(ld.plusMonths(1));
		System.out.println(ld.plusYears(1));*/
		
		//LocalDate to String
		System.out.println(LocalDate.now().toString());
		//String to Date
		System.out.println(LocalDate.parse("2012-11-22"));
		
		
		//Local Time class
		LocalTime lt=LocalTime.now();
		System.out.println("Time "+lt+" Hours : "+lt.getHour()+" Minutes :  "+lt.getMinute()+" Seconds : "+lt.getSecond());
		
		//LocalDateAndTime class
		LocalDateTime ldt=LocalDateTime.now();
		System.out.println(ldt);
		
		Period between = Period.between(LocalDate.parse("1996-10-30"),LocalDate.now());
		System.out.println(between);
		
		Duration dur=Duration.between(LocalTime.parse("10:30"), LocalTime.now());
		System.out.println(dur);
		
	}
}

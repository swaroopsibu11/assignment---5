package com.evry.java8_concepts;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class App9 {

	public static void main(String[] args) {

		LocalDate date = LocalDate.now();
		System.out.println("The date is " + date);

		LocalTime time = LocalTime.now();
		System.out.println("The time is " + time);

		LocalDateTime current = LocalDateTime.now();
		System.out.println("The current date and time :" + current);

		DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String formatDateTime = current.format(format);
		System.out.println("In formated manner :" + formatDateTime);

		Month month = current.getMonth();
		int day = current.getDayOfMonth();
		int seconds = current.getSecond();
		System.out.println("Month :" + month + "day :" + day + "seconds :" + seconds);

		LocalDate date1 = LocalDate.of(2019, 6, 3);
		System.out.println(date1);
		
	}
}

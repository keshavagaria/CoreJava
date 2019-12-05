package com.csi.date_api;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Locale;;
public class DateTimeApi {
public static void main(String[] args) {
	LocalDate date=LocalDate.now();
	LocalTime time=LocalTime.now();
	LocalDateTime dt=LocalDateTime.now();
	System.out.println(date);
	System.out.println(time);
	System.out.println(dt);
	
	LocalDate date2=LocalDate.of(1947,8,15);
	LocalDate date3=LocalDate.of(1947,Month.DECEMBER,12);
	LocalTime time2=LocalTime.of(0, 30, 30);

	System.out.println(date2);
	System.out.println(date3);
	System.out.println(time2);
}
}

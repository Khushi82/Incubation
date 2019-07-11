package com.epam.incubation;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateAndTime {

	public void dateFormat(String format, String timeZone) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		SimpleDateFormat formatter = new SimpleDateFormat(format);
		System.out.println("Date in the format " + format + ".......................................");
		System.out.println(formatter.format(calendar.getTime()));
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		DateAndTime date = new DateAndTime();
		System.out.println("Enter the format you want to get displayed.........");
		String format = scanner.next();
		System.out.println("Enter the TimeZone you want to get displayed.........");
		String timeZone = scanner.next();
		date.dateFormat(format, timeZone);

	}

}

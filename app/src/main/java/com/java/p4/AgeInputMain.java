package com.java.p4;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AgeInputMain {
	public static void main(String[] args) {
		GregorianCalendar today;
		int age, thisYear, bornYr;
		String answer;

		Scanner scanner = new Scanner(System.in);
		AgeInputVer2 input = new AgeInputVer2();
		age = input.getAge("How old are you? ");
		today = new GregorianCalendar();
		thisYear = today.get(Calendar.YEAR);
		bornYr = thisYear - age;

		System.out.print("Already had your birthday this year? (Y or N)");
		answer = scanner.next();
		if (answer.equals("N") || answer.equals("n")) {
			bornYr--;
		}
		System.out.println("\nYou are born in " + bornYr);
	}
}

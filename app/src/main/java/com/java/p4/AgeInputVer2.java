package com.java.p4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AgeInputVer2 {
	private static final String DEFAULT_MESSAGE = "Your age: ";
	private Scanner scanner;

	public AgeInputVer2() {
		scanner = new Scanner(System.in);
	}

	public int getAge() {
		return getAge(DEFAULT_MESSAGE);
	}

	public int getAge(String prompt) {
		int age;
		while (true) {
			System.out.print(prompt);
			try {
				age = scanner.nextInt();
				return age;
			} catch (InputMismatchException e) {
				scanner.next();
				System.out.println(
						"Invalid Entry. Please enter digits only.");
			}
		}
	}
}

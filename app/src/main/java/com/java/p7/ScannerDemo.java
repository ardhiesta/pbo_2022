package com.java.p7;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		// Scanner definition
		Scanner scn = new Scanner(System.in);

		// input is a string ( one word )
		// read by next() function
		String str1 = scn.next();

		// print String
		System.out.println("Entered String str1 : " + str1);

		// input is a String ( complete Sentence )
		// read by nextLine()function
		String str2 = scn.nextLine();

		// print string
		System.out.println("Entered String str2 : " + str2);

		// input is an Integer
		// read by nextInt() function
		int x = scn.nextInt();

		// print integer
		System.out.println("Entered Integer : " + x);

		// input is a floatingValue
		// read by nextFloat() function
		float f = scn.nextFloat();

		// print floating value
		System.out.println("Entered FloatValue : " + f);
	}
}
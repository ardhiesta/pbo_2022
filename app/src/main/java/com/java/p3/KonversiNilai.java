package com.java.p3;

import java.util.Scanner;

public class KonversiNilai {
	public static void main(String[] args) {
		System.out.println("Ketik nilai : ");
		Scanner sc = new Scanner(System.in);
		int nilai = sc.nextInt();

		if (nilai >= 85)
			System.out.println("A");
		else if (nilai >= 80 && nilai <= 84)
			System.out.println("A-");
		else if (nilai >= 75 && nilai <= 79)
			System.out.println("B+");
		else if (nilai >= 70 && nilai <= 74)
			System.out.println("B");
		else if (nilai >= 65 && nilai <= 69)
			System.out.println("C+");
		else if (nilai >= 60 && nilai <= 64)
			System.out.println("C");
		else if (nilai >= 55 && nilai <= 59)
			System.out.println("D");
		else 
			System.out.println("E");
//		
//		if (nilai < 55)
//			System.out.println("E");
//		else if (nilai < 60)
//			System.out.println("D");
//		else if (nilai < 65)
//			System.out.println("C");
//		
//		boolean done = true;
//		boolean x = true;
//		boolean y = true;
//		done = x = y;
		
//		String str1, str2;
//		str1 = new String("Java");
//		str2 = new String("Java");
//		
//		if (str1.equals(str2)) {
//			System.out.println("sama");
//		} else {
//			System.out.println("beda");
//		}
	}
}

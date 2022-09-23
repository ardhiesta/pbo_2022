package com.java.p4;

import java.util.Scanner;

public class CekBilangan {
	public static void main(String[] args) {
		System.out.print("Ketik bilangan : ");
		Scanner scanner = new Scanner(System.in);
		int bil = scanner.nextInt();
		
		if (bil % 2 == 0)
			System.out.println(bil + " adalah bilangan genap");
		else
			System.out.println(bil + " adalah bilangan ganjil");
	}
}


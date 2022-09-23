package com.java.p4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CekBilangan2 {
	public static void main(String[] args) {
		int bil;
		Scanner scanner = new Scanner(System.in);
		boolean lanjut = true;
		while(lanjut) {
			try {
				System.out.print("Ketik bilangan : ");
				bil = scanner.nextInt();
				if (bil % 2 == 0)
					System.out.println(bil + " adalah bilangan genap");
				else
					System.out.println(bil + " adalah bilangan ganjil");
				
				lanjut = false;
			} catch(InputMismatchException e) {
				scanner.next();
				System.out.println("Input salah, masukkan angka");
			}
		}
	}
}



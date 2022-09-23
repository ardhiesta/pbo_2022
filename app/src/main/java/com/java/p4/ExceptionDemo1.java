package com.java.p4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int bil1, bil2;
		boolean lanjut = true;
		while (lanjut) {
			try {
				System.out.print("Ketik bilangan pertama : ");
				bil1 = sc.nextInt();
				System.out.print("Ketik bilangan kedua : ");
				bil2 = sc.nextInt();
				if (bil2 == 0) {
					throw new Exception("bilangan kedua tidak boleh nol");
				}
				double hasil = Double.valueOf(bil1) / Double.valueOf(bil2);
				System.out.println(bil1 + " / " + bil2 + " = " + hasil);
				lanjut = false;
			} catch (InputMismatchException e) {
				sc.next();
				System.out.println("Input salah, masukkan angka");
			} catch(Exception e) {
				System.out.println("error, "+e.getMessage());
			}
		}
	}
}

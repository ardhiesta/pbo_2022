package com.java.p3;

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

//		System.out.print("Ketik bilangan : ");
//		int bil2 = scanner.nextInt();
//		if (bil2 < 2)
//			System.out.println("bilangan kurang dari 2");
//        
//        int a = 0;
//        int b = 0;
//        int x = 0;
//        int y = 0;
//        int z = 0;
//        
//        if (a < b) 
//        	x = y; 
//        else 
//        	x = z;
        
	}
}

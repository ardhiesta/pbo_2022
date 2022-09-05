package com.java.p2;

public class DemoArray {
	public static void main(String[] args) {
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
//		System.out.println(cars[0]);
//		System.out.println(cars[1]);
//		System.out.println(cars[2]);
//		System.out.println(cars[3]);
		
		for(String loop : cars)
			System.out.println(loop);
		
//		for(int i = 0; i < 5; i++) {
//			System.out.println(cars[i]);
//		}
	}
}

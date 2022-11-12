package com.java.p8;

public class TestMethodOverloading {
	public static int average(int n1, int n2) {
		return (n1 + n2) / 2;
	}

	public double average(double n1, double n2) {
		return (n1 + n2) / 2;
	}

	public static int average(int n1, int n2, int n3) {
		return (n1 + n2 + n3) / 3;
	}
	
	final static double PI = 3.14;

	public static void main(String[] args) {
//		System.out.println(average(1, 2));
//		System.out.println(average(1.0, 2.0));
//		System.out.println(average(1, 2, 3));
		TestMethodOverloading testMethodOverloading = new TestMethodOverloading();
		System.out.println(testMethodOverloading.average(1.0, 2));
		System.out.println(PI);
//		System.out.println(average(1,2,3,4));
	}
}

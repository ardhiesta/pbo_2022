package com.java.p4;

public class TestClassInheritance {
	public static void main(String[] args) {
		ClassA a = new ClassA();
		ClassB b = new ClassB();
		
		System.out.println(a.x); //3
		System.out.println(b.x); //6
		
		a.printX(); // x = 3
		b.printX(); // x = 6
	}
}

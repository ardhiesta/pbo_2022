package com.java.p8;

public class App {
	public static void main(String[] args) {
		Pet pet = new Pet();
		Pet pet1 = new Dog();
		System.out.println(((Dog)pet1).fetch());
		
		Cat cat = new Cat();
		System.out.println(cat.speak());
		
		Dog dog = new Dog();
		System.out.println(dog.speak());
		
		// spesifik --> general
		// subclass --> superclass
		Cat cat1 = new Pet();
//		
		// general --> spesifik
		// superclass --> subclass
		Pet pet2 = new Cat();
	}
}

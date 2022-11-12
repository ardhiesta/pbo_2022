package com.java.p8;

public class Cat extends Pet {
	public String speak() {
		return "Don't give me orders.\n" + "I speak only when I want to.";
	}

	public static void main(String[] args) {
		Pet pet = new Pet();
		System.out.println(pet.speak());
		
		System.out.println("");
		
		Cat cat = new Cat();
		System.out.println(cat.speak());
		
		System.out.println("");
		
		Pet pet2 = new Cat();
		System.out.println(pet2.speak());
	}
}

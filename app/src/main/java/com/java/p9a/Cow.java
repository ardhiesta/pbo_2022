package com.java.p9a;

// Cow "implements" the Animal interface
public class Cow implements Animal {

	@Override
	public void animalSound() {
		// The body of animalSound() is provided here
	    System.out.println("The cow says: moo moo");
	}

	@Override
	public void sleep() {
		// The body of sleep() is provided here
	    System.out.println("Zzz");
	}

}

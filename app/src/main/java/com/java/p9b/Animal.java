package com.java.p9b;

public class Animal implements AnimalEat, AnimalTravel {

	@Override
	public void travel() {
		System.out.println("Animal is travelling");
	}

	@Override
	public void eat() {
		System.out.println("Animal is eating");
	}

}

package com.java.p9;

// class Polagon turunan dari Bike
public class Polagon extends Bike {
	// implementasi abstract method
	@Override
	void run() {
		System.out.println("alon-alon waton kelakon");
	}

	public static void main(String[] args) {
		Bike bike = new Polagon();
		bike.run();
	}
}

package com.java.p2;

public class Main {
	int x; // Create a class attribute
	int y;

	// Create a class constructor for the Main class
	public Main() {
		System.out.println("objek dari class Main berhasil dibuat");
		//x = 5; // Set the initial value for the class attribute x
	}
	
	public Main(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public static void main(String[] args) {
		Main myObj = new Main(3, 4); // Create an object of class Main (This will call the constructor)
		System.out.println(myObj.x); // Print the value of x
		System.out.println(myObj.y); // Print the value of y
	}
}

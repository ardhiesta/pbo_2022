/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.java;

public class App {
	/**
	 * 
	 * method getString
	 * menampilkan String "Hello World" ke layar
	 */
    public String getGreeting() {
        return "Hello World!";
    }

    // main method
    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }
}

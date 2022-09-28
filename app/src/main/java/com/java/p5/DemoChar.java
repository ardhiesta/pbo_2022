package com.java.p5;

public class DemoChar {
	public static void main(String[] args) {
		// variabel char
		char varA = 'a';
		// print char
		System.out.println(varA);
		// print kode ASCII dari char
		System.out.println((int) varA);
		// print char dari kode ASCII
		System.out.println((char) 99);
		
		// penjumlahan char (menjumlahkan kode ascii)
		System.out.println('a'+'b');
		
		char first1 = '\u3044';
        System.out.println(first1);
        char second2 = '\uA9C5';
        System.out.println(second2);
        char third3 = '\u0031';
        System.out.println(third3);
        char fourth4 = '\u007E';
        System.out.println(fourth4);
        char fifth5 = '\u0024';
        System.out.println(fifth5);
        char sixth6 = '\u0061';
        System.out.println(sixth6);
        char seventh7 = '\ua993';//'\u0041';
        System.out.println(seventh7);
	}
}

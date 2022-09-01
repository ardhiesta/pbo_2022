package com.java.p1;

/**
 * Class SegiTiga
 * @author linuxluv
 *
 */
public class SegiTiga {
	int alas = 3;
	int tinggi = 4;
	int sisiMiring = 5;
	
	/**
	 * method untuk menghitung luas segitiga
	 * @return
	 */
	public Double hitungLuas() {
		Double luas = 0.5 * this.alas * this.tinggi;
		return luas;
	}
	
	public Double hitungKeliling() {
		// tambahkan source code untuk menghitung keliling segitiga
		Double keliling = 0.0;
		// casting data type
		keliling = Double.valueOf(this.alas) 
				+ Double.valueOf(this.tinggi) 
				+ Double.valueOf(this.sisiMiring);
		return keliling;
	}
	
	/**
	 * main method
	 * @param args
	 */
	public static void main(String[] args) {
		SegiTiga segiTiga = new SegiTiga();
		System.out.println("alas : "+segiTiga.alas);
		System.out.println("tinggi : "+segiTiga.tinggi);
		System.out.println("sisi miring : "+segiTiga.sisiMiring);
		System.out.println("Luas segitiga : "+segiTiga.hitungLuas());
		
		// tambahkan code untuk menampilkan keliling segitiga
		System.out.println("Keliling segitiga : "+segiTiga.hitungKeliling());
	}
}

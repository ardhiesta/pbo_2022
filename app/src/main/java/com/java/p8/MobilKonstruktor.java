package com.java.p8;

public class MobilKonstruktor {
	public static void main(String[] args) {
		Mobil mobil1 = new Mobil();
		// print warna dan tahun produksi mobil1
		mobil1.info();
		
		Mobil mobil2 = new Mobil("hitam", 2009);
		Mobil mobil3 = new Mobil(2009, "hitam");
	}
}

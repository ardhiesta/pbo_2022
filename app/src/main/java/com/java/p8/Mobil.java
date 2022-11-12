package com.java.p8;

public class Mobil {
	String warna;
	int tahunProduksi;

	public Mobil(String warna, int tahunProduksi){
	    this.warna = warna;
	    this.tahunProduksi = tahunProduksi;
	}
	
	public Mobil(){
	}
	
	public Mobil(int tahunProduksi, String warna){
	    this.warna = warna;
	    this.tahunProduksi = tahunProduksi;
	}
	
	void info(){
	     System.out.println("Warna: " + warna);
	     System.out.println("Tahun: " + tahunProduksi);
	}
	
	void info(String merk){
		System.out.println("Merk: " + merk);
		System.out.println("Warna: " + warna);
	    System.out.println("Tahun: " + tahunProduksi);
	}
}

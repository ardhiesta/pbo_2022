package com.java.p1;

public class Mahasiswa {
	String nim, nama, jenisKelamin, alamat;
	
	void isiData() {
		this.nim = "M0507001";
		this.nama = "Kurnia Santika";
		this.jenisKelamin = "P";
		this.alamat = "Solo";
	}
	
	void printData() {
		System.out.println("nim: "+this.nim);
		System.out.println("nama: "+this.nama);
		System.out.println("jenis kelamin: "+this.jenisKelamin);
		System.out.println("alamat: "+this.alamat);
	}
	
	public static void main(String[] args) {
		Mahasiswa mhs = new Mahasiswa();
		mhs.isiData();
		mhs.printData();
	}
}

package com.java.p2;

public class Karyawan {
	String ID, nama, divisi;
	double gaji;
	
	//constructor kelas karyawan
	Karyawan(String ID, String nama, String divisi, double gaji) {
		this.ID = ID;
		this.nama = nama;
		this.divisi = divisi;
		this.gaji = gaji;
	}
	
	void cetakData() {
		System.out.println("Data Karyawan :");
		System.out.println("ID : " + ID);
		System.out.println("Nama : " + nama);
		System.out.println("Divisi : " + divisi);
		System.out.println("Gaji : " + gaji);
	}
	
	double hitungSumbanganZakat() {
		double zakat = gaji * 0.025;
		return zakat;
	}
	
	public static void main(String[] args) {
		Karyawan karyawan1 = new Karyawan("k005","Bella", "HRD", 2150000);
		karyawan1.cetakData();
	}
}

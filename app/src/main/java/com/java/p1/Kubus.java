package com.java.p1;

import java.lang.Math;

public class Kubus {
	int sisiKubus = 5;
	
	public Double hitungVolume() {
		Double volume = 0.0;
		// tambahkan code untuk menghitung volume kubus
		// casting data type
		double sisi = sisiKubus;
		volume = sisi * sisi * sisi;
		// atau
		// volume = Math.pow(sisi, 3);
		return volume;
	}
	
	public int hitungLuasPermukaan() {
		int luasPermukaan = 0;
		// tambahkan code untuk menghitung luas permukaan kubus
		luasPermukaan = 6 * (this.sisiKubus * this.sisiKubus);
		return luasPermukaan;
	}
	
	/**
	 * buat main method
	 * buat objek dari class Kubus
	 * tampilkan hasil perhitungan volume kubus
	 * tampilkan hasil perhitungan luas permukaan kubus
	 */
	public static void main(String[] args) {
		Kubus kubus = new Kubus();
		System.out.println("Volume kubus = "+kubus.hitungVolume());
		System.out.println("Luas permukaan kubus = "+kubus.hitungLuasPermukaan());
	}
}

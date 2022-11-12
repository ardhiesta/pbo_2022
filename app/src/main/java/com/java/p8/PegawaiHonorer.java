package com.java.p8;

public class PegawaiHonorer implements Pegawai {
	int jmlHari;
	int gajiHarian;
	int gajiTotal;

	@Override
	public void hitungGaji() {
		// TODO Auto-generated method stub
		gajiTotal = jmlHari * gajiHarian;
	}
}

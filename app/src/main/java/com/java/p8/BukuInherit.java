package com.java.p8;

public class BukuInherit extends Buku {
	public BukuInherit(String isbn, String judul, String penulis, String penerbit, int tahunTerbit) {
		super(isbn, judul, penulis, penerbit, tahunTerbit);
		super.isbn = isbn;
		super.judul = judul;
		super.penulis = penulis;
		super.penerbit = penerbit;
		super.tahunTerbit = tahunTerbit;
	}
}

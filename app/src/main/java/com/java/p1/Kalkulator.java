package com.java.p1;

public class Kalkulator {
	// atribut
	Double bil1, bil2;

    public static void main(String[] args) {
        // membuat objek dari class Kalkulator
        Kalkulator kalkulator = new Kalkulator();

        // assignment nilai variabel, bilanngan yang akan dioperasikan
        kalkulator.bil1 = 7.0;
        kalkulator.bil2 = 4.0;

        // mengalikan bilangan, disimpan ke variabel
        Double hasil = kalkulator.kali(kalkulator.bil1, kalkulator.bil2);

        // print hasil
        System.out.println(hasil);
    }

    // method untuk menambahkan bilangan
    Double tambah(Double b1, Double b2){
        Double hasil = 0.0;
        hasil = b1 + b2;
        return hasil;
    }

    // method untuk mengurangkan bilangan
    Double kurang(Double b1, Double b2){
        Double hasil = 0.0;
        hasil = b1 - b2;
        return hasil;
    }

    // method untuk membagi bilangan
    Double bagi(Double b1, Double b2){
        Double hasil = 0.0;
        hasil = b1 / b2;
        return hasil;
    }

    // method untuk mengalikan bilangan
    Double kali(Double b1, Double b2){
        Double hasil = 0.0;
        hasil = b1 * b2;
        return hasil;
    }
}

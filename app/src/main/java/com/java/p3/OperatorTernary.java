package com.java.p3;

public class OperatorTernary {
	public static void main(String[] args) {
		boolean suka = true;
        String jawaban;

        // menggunakan operator ternary
        jawaban = suka ? "iya" : "tidak";

        // menampilkan jawaban
        System.out.println(jawaban);
        
        int testScore = 65;
        System.out.println((testScore < 70) ? "not pass" : "pass");
	}
}

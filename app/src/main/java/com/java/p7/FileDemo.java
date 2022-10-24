package com.java.p7;

import java.io.File;

import javax.swing.JOptionPane;

public class FileDemo {
	public static void main(String[] args) {
		File inFile = new File("/tmp/sample.txt");
		if (inFile.exists()) { 
			// menampilkan pesan kalau file yang dimaksud tidak ada
			JOptionPane.showMessageDialog(null, 
					"file "+inFile.getName()+" tidak ada");
		} else {
			// menampilkan pesan kalau file yang dimaksud ada
			JOptionPane.showMessageDialog(null, 
					"file "+inFile.getName()+" ada");
		}
	}
}

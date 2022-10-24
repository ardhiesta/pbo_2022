package com.java.p7;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamDemo {
	public static void main(String[] args) 
			throws ClassNotFoundException, IOException {
		// set up file and stream
		File inFile = new File("/tmp/objects.dat");
		FileInputStream inFileStream = new FileInputStream(inFile);
		ObjectInputStream inObjectStream = new ObjectInputStream(inFileStream);

		// read the Person objects from a file
		Mahasiswa mhs;
		for (int i = 0; i < 10; i++) {
			mhs = (Mahasiswa) inObjectStream.readObject();
			System.out.println(
					mhs.getNim() + ", " + mhs.getNama() + ", " 
			+ mhs.getJenisKelamin() + ", " + mhs.getAlamat());

		}
		// input done, so close the stream
		inObjectStream.close();
	}
}

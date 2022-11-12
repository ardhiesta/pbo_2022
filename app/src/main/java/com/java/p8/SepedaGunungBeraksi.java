package com.java.p8;

public class SepedaGunungBeraksi {
	public static void main(String[] args) {
		// Sepeda : Superclass / parent
		// SepedaGunung : Subclass / child
		
		Sepeda sepeda = new SepedaGunung();
		System.out.println(sepeda instanceof SepedaGunung);
		System.out.println(sepeda instanceof Sepeda);
		
		SepedaGunung sepedaGunung = new SepedaGunung();
		System.out.println(sepedaGunung instanceof SepedaGunung);
		System.out.println(sepedaGunung instanceof Sepeda);
		
		// sepeda --> new SepedaGunung()
		// sepeda = SepedaGunung
		// SepedaGunung mewarisi Sepeda
//		System.out.println(sepeda instanceof Sepeda); // true, karena child = parent
//		System.out.println(sepeda instanceof SepedaGunung); 
		
		
//		SepedaGunung sg = new SepedaGunung();
//
//		sg.setGir(2);
//		System.out.println(sg.getGir());
//
//		sg.setGir(3);
//		System.out.println(sg.getGir());
		
//		Sepeda sepeda = new SepedaGunung();
//		sepeda.setGir(3);
//		System.out.println(sepeda.getGir());
	}
}

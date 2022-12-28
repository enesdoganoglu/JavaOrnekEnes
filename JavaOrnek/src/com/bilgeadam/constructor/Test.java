package com.bilgeadam.constructor;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Goz goz = new Goz("Mavi");
		Kulak kulak = new Kulak("Kepçe");
		Burun burun = new Burun("Kemer");
		
		
		Kafa kafa = new Kafa(goz,kulak,burun);
		
		YeniInsan yeni = new YeniInsan(kafa,"ibrahim","gökyar");
		yeni.EkranaYaz();
		
	
		
		//Scanner s = new Scanner();
	}

}

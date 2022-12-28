package com.bilgeadam.oop2;

import com.bilgeadam.oop.Matematik;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Araba a = new Araba();
		a.marka = "Bmw";
		a.model = "X5";
		a.kapiSayisi = 4;
		a.pencereSayisi = 4;
		
		//a.Git("Mercedes","XL"); // metodu çağırdık
		a.Git(a.marka,a.model);
		Matematik m = new Matematik();
		int c = m.Topla(5, 5);
		
		Bmw b = new Bmw();
		b.MarkaModelYaz("Bmw", "X5");
		
		Mercedes mercedes = new Mercedes();
		mercedes.MarkaModelYaz("Mercedes", "XL");
		
		Porche porche = new Porche();
		porche.marka = "Porche";
		porche.model = "Carrera";
		porche.MarkaModelYaz(porche.marka, porche.model);
		
		

	}

}

package com.bilgeadam.abstracts2;

public class Test {

	public static void main(String[] args) {
		
		Bmw b = new Bmw();
		Mercedes m = new Mercedes();
		Porche p = new Porche();
		
		double toplamBenzin = 0.0;
		
		toplamBenzin = b.HarcananBenzinMiktari()+m.HarcananBenzinMiktari()+p.HarcananBenzinMiktari();
		System.out.println("Harcanan Toplam Benzin : "+toplamBenzin+ " Litredir.");

	}

}

package com.bilgeadam.collection;

import java.util.ArrayList;

public class PersonelListesiOrnek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Personel p1 = new Personel("ibrahim","gökyar",5000.0);
		Personel p2 = new Personel("Hakan","Yılmaz",4000.0);
		Personel p3 = new Personel("Hüseyin","Yılmaz",3000.0);
		
		ArrayList<Personel> personelListesi = new ArrayList<Personel>();
		personelListesi.add(p1);
		personelListesi.add(p2);
		personelListesi.add(p3);
		double toplamMaas = 0.0;
		for(Personel per : personelListesi)
		{
			toplamMaas += per.maas;
		 System.out.println("Personelin adı : "+per.ad + " soyadı : "+per.soyad + " maaşı : "+per.maas);
		}
		System.out.println("Personel Toplam Maaşı : "+toplamMaas);

	}

}

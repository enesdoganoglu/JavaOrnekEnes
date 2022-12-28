package com.bilgeadam.abstracts;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Calisan c = new Calisan();
		GenelMudur gm = new GenelMudur();
		//gm.gorev = "Genel Müdür";
		Mudur m = new Mudur();
		m.gorev = "Müdür";
		Programci p = new Programci();
		Stajyer s = new Stajyer();
		
		int toplam = 0;
		toplam = gm.MaasinizNedir()+m.MaasinizNedir()+p.MaasinizNedir()+s.MaasinizNedir();
		System.out.println("Toplam Maaş : "+toplam+ " TL ");
				
	}

}

package com.bilgeadam.oop;

public class Test2 {

	public static void main(String[] args) {
		
		Anne a = new Anne();
		a.ad = "Fahriye";
		a.soyad = "Gökyar";
		a.yas = 65;
		a.maas = 33.0;
		a.cinsiyet = true;
		System.out.println("Yaşınız : "+a.YasHesapla(1954));
		a.Uyu(a.ad, a.soyad);
		a.EkranaYaz(a.ad, a.soyad);
		a.Oku(a.ad);
		Baba b = new Baba();
		b.ad = "Kasım";
		b.soyad = "Gökyar";
		b.EkranaYaz(b.ad, b.soyad);
		b.Oku(b.ad);
		b.Dinle(b.ad);
	
		Cocuk c = new Cocuk();
		c.ad = "İbrahim";
		c.soyad= "Gökyar";
		c.EkranaYaz(c.ad, c.soyad);
		
		AkilliCocuk ak = new AkilliCocuk();
		ak.ad="Hakan";
		ak.soyad = "Yılmaz";
		ak.sifat = "Akıllıdır";
		ak.AdSoyadSifatYaz(ak.ad, ak.soyad, ak.sifat);
		ak.AskereGit(ak.ad);
		ak.EhliyetAl(ak.ad);
		ak.KlubeGit(ak.ad);
		
		UsluCocuk us = new UsluCocuk();
		us.ad = "Mehmet";
		us.AdSoyadSifatYaz("Mehmet", "Yılmaz", "Usludur");
		us.AskereGit(us.ad);
		us.EhliyetAl(us.ad);
	
		HiperaktifCocuk hp = new HiperaktifCocuk();
		hp.ad= "Hüseyin";
		hp.EhliyetAl(hp.ad);
		

	}

}

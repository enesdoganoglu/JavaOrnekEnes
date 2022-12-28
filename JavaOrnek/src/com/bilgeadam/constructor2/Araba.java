package com.bilgeadam.constructor2;

public class Araba {

	public Kasa kasa;
	public int fiyat;
	
	
	public Araba(Kasa kasa,int fiyat)
	{
		this.kasa = kasa;
		this.fiyat = fiyat;
	}
	
	public String EkranaYaz()
	{
		return "Arabanın markası : "+kasa.marka.markasi
							+" Modeli : "+kasa.model.modeli
							+" Kapı Sayısı : "+kasa.kapi.kapiSayisi
							+" Pencere Sayısı : "+kasa.pencere.pencereSayisi
							+" Kasası : "+kasa.kasaTipi
							+" Fiyatı :"+fiyat;
	}
}

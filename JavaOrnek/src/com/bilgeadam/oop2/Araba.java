package com.bilgeadam.oop2;

public class Araba 
{
	
	public String marka;
	public String model;
	public int kapiSayisi;
	public int pencereSayisi;
	
	//bir metodu parametre gönderecek eğer
	// ilgili metodu parametre alacak hale dönüştürmeliyiz
	// ve göndereceğimiz parametrenin önce tipini belirtmeliyiz
	public void Git(String markasi,String modeli)
	{
		System.out.println(markasi +" "+modeli +" Gidiyor...");
	}
	
	public void MarkaModelYaz(String markasi,String modeli)
	{
		System.out.println("Arabanın Markası : "+markasi + " Modeli : "+modeli);
	}

}

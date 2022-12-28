package com.bilgeadam.constructor;

public class YeniInsan {
	
	public Kafa kafa;
	public String ad;
	public String soyad;
	
	
	public YeniInsan(Kafa kafa,String ad,String soyad)
	{
		this.kafa = kafa;
		this.ad = ad;
		this.soyad = soyad;
	}
	
	public void EkranaYaz()
	{
		System.out.println("Kişinin Adı : "+ad+" Kişinin soyadı : "+soyad
	                        +"Göz rengi : " +kafa.goz.renk
	                        +"Kulağı : "+kafa.kulak.sekil
	                        +"Burnu : "+kafa.burun.sekil);
	}

}

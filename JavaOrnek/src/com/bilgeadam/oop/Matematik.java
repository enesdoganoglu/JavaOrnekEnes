package com.bilgeadam.oop;

public class Matematik  {
	
	//access modifiers dönüşTipi MetotAdi
	public int Topla(int sayi1,int sayi2)
	{
		//local variable
		int sonuc = 0;
		
		sonuc = sayi1+ sayi2;
		
		return sonuc;
	    //return sayi1 + sayi2;
	}
	//metodun ismi aynı ancak parametreleri ve dönüş tipleri farklı
	// olan metodlara overload metodlar 
	public double ikiDouleSayiTopla(double sayi1,double sayi2)
	{
		return sayi1+sayi2;
	}
	
	public int Carp(int sayi1,int sayi2)
	{
	
	    return sayi1 * sayi2;
	}
	
	
	public int Bol(int sayi1,int sayi2)
	{
	    return sayi1 / sayi2;
	}
	
	public int Cikar(int sayi1,int sayi2)
	{
	    return sayi1 - sayi2;
	}

	//2 tane int parametre alan ve geriye int tipinde deger dönen bir metot
	

	
}

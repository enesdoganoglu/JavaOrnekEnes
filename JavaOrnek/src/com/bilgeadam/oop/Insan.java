package com.bilgeadam.oop;

public class Insan 
{   //Başlangıç Scope
   //access modifiers   VeriTipi   DeğişkenAdi 
	//global variable
	public String  ad;
	public String  soyad;
	public int     yas;// Tamsayısal verileri saklayabiliriz
	public double  maas; //.Noktalı kesirli ifadelerde double kallanırı 
	public boolean cinsiyet; // true yada false şeklinde değer saklarız
	public static int Boy;
	
	//Metotlar 2 ye ayrılırlar
	//Değer Döndüren Metotlar
	//Değer Döndürmeyen Metotlar
	
   //access modifiers dönüştipi metotAdi() {  }
	//Geriye değer döndürmeyen Adı Uyu olan bir metot tanımladık
	//access modifiers  dönüştipi
	//Casting, Convert Etme
	  public            void      Uyu(String adi,String soyadi)
	  {
		
		   System.out.println(adi +" "+ soyadi +" Uyuyor");
	  }
	  
	  public int YasHesapla(int dogumYili)
	  {
		  int sonuc= 0;
		  sonuc =  2022 - dogumYili;
		  return sonuc;
	  }
	  
	  public void EkranaYaz(String adi,String soyadi)
	  {
		  System.out.println("Kişinin Adı : "+adi+" Kişinin Soyadı : "+soyadi);
	  }
	
	  
	  //Constructor 
	  //Class ın ismi ile aynı geri dünüş tipi olmayan bir metod devreye girer
	  //biz bir class tan nesne oluşturduğumuz zaman böyle bir metod devreye girer
	  //boş constructor
	 public Insan ()
	 {
		 
	 }
	 
	 //parametre alan constructor
	 //Ben Insan class ından bir nesne daha oluştururka
	 //bu class ın içindeki ad ve soyad değişkenlere
	 //değer atamış olacağım.
	 public Insan(String ad,String soyad)
	 {
		 this.ad = ad;
		 this.soyad = soyad;
	 }
	 
	 public Insan(String ad,String soyad,int yas)
	 {
		 this.ad = ad;
		 this.soyad = soyad;
		 this.yas = yas;
	 }
	 
	 public Insan(String ad,String soyad,int yas,double maas,boolean cinsiyet)
	 {
		 this.ad = ad;
		 this.soyad= soyad;
		 this.yas = yas;
		 this.maas = maas;
		 this.cinsiyet = cinsiyet;
	 }
	  
	
}  // Bitiş Scope

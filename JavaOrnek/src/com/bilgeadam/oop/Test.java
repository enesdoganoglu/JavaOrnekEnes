package com.bilgeadam.oop;

import java.util.Scanner;

public class Test 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
       //System.out.println("Merhaba Dünya");
		// ClassIsmi nesnemizindAdi = new ClassIsmi();
		//Static değişkenlerde ilgili class tan nesne oluşturmaya gerek kalmadan
		//class ismi ilgili değişkene ve metoda erişebiliriz.
		   Insan.Boy = 180;
		   //Insan.Uyu(null, null);
		   Insan       i            = new Insan();
		   i.ad = "ibrahim";
		   i.soyad = "gökyar";
		   i.yas = 45;
		   i.maas = 5000.0;
		   i.cinsiyet = true;
		   
		   Insan       i22            = new Insan();
		   i22.ad = "ibrahim";
		   i22.soyad = "gökyar";
		   i22.yas = 45;
		   i22.maas = 5000.0;
		   i22.cinsiyet = true;
		 
		   Insan insan = new Insan("Hakan","Yılmaz");
		   
		   Insan i3 = new Insan("Hüseyin","Yılmaz",44);
		   
		   Insan i4 = new Insan("Metin","Yılmaz",33,4500.0,true);
		   
		   Scanner scan = new Scanner(System.in);
		   
		   
		   i.Uyu(i.ad,i.soyad); // insan class ı içindeki uyu metodunu çağırdık
		   Matematik m = new Matematik();
		   //1. yöntem
		   int gelenDeger = m.Topla(15, 15);
		   System.out.println("Toplam : "+gelenDeger);
		   
		   System.out.println("Yaşınız : "+i.YasHesapla(1978));
		   
		   //2. yöntem
		   System.out.println("Toplam 2. yöntem : "+m.Topla(25, 25));
		   
		   System.out.println("Çarpım Sonucu : "+m.Carp(25, 25));
		   
		   System.out.println("Bölüm Sonucu  : "+m.Bol(25, 25));
		   
		   System.out.println("Çıkan Sonuc  : "+m.Cikar(25, 25));
		   
		   String abc = "32";
		   
		   int xyz = Integer.valueOf(abc);
		   int toplamSonucu = 2 + xyz;
		   System.out.println("Toplam Sonucu : "+toplamSonucu);
		   
	}

}

package com.bilgeadam.collection;

import java.util.ArrayList;

import com.bilgeadam.abstracts.Calisan;
import com.bilgeadam.abstracts.GenelMudur;
import com.bilgeadam.abstracts.Mudur;
import com.bilgeadam.abstracts.Programci;
import com.bilgeadam.abstracts.Stajyer;

public class ArrayListOrnek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int,double,byte,short gibi değişken tipleri primtive tip olarak 
		//wrapper sarmalama değer tipli bir değişkeni referans tipli bir değişkene çevirmek
		//Integer class ı gibi bizimde kendi tanımladığımız class lar aslında hepsi bir Object tir
		GenelMudur gm = new GenelMudur();
		Mudur m = new Mudur();
		Programci p = new Programci();
		Stajyer s = new Stajyer();
		ArrayList<Calisan> list = new ArrayList<Calisan>();
		list.add(gm);
		list.add(m);
		list.add(p);
		list.add(s);
	    int toplam =0;
	    int normalForToplam= 0;
	   for(int i=0;i<list.size();i++)
	    {
		   normalForToplam += list.get(i).MaasinizNedir();
	    }
	   System.out.println("Normal for Toplam : "+normalForToplam);
	    
		for(Calisan str : list)
		{
			System.out.println(str.MaasinizNedir());
			toplam += str.MaasinizNedir();
		}
		System.out.println("Çalışanların toplam maaşı. "+toplam);
		if(list.contains(33)) {
			System.out.println("bu sayı listede var");	
		}
		else
		{
			System.out.println("ilgili sayı listede yok");
		}

	}

}

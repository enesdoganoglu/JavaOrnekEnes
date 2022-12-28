package com.bilgeadam.diziler;

import com.bilgeadam.abstracts.Calisan;
import com.bilgeadam.abstracts.GenelMudur;
import com.bilgeadam.abstracts.Mudur;
import com.bilgeadam.abstracts.Programci;
import com.bilgeadam.abstracts.Stajyer;

public class CalisanDiziOrnek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenelMudur gm = new GenelMudur();
		Mudur m = new Mudur();
		Programci p = new Programci();
		Stajyer s = new Stajyer();
		
		Calisan[] calisanlar = {gm,m,p,s};
		int toplam = 0;
		for(int i=0;i<calisanlar.length;i++)
		{
			toplam = toplam + calisanlar[i].MaasinizNedir();
			//toplam += calisanlar[i].MaasinizNedir();
		}
		System.out.println("Çalışanların toplam maaşı : "+toplam);

	}

}

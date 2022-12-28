package com.bilgeadam.diziler;

public class SayilarDiziOrnek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//n elemanlı bir dizi tanımladık
		int[] sayilar = {2,3,10,15,7,8,22,33,44,10};
		int toplam = 0;
		for(int i=0;i<sayilar.length;i++)
		{
			toplam += sayilar[i];
			//toplam = toplam + sayilar[i];
			//System.out.println(sayilar[i]);
		}
		System.out.println("Sayıların Toplamı : "+toplam);
		

	}

}

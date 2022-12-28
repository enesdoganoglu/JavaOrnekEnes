package com.bilgeadam.diziler;

import com.bilgeadam.abstracts2.Araba;
import com.bilgeadam.abstracts2.Bmw;
import com.bilgeadam.abstracts2.Mercedes;
import com.bilgeadam.abstracts2.Porche;

public class ArabaDiziOrnek {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bmw b = new Bmw();
		Mercedes m = new Mercedes();
		Porche p = new Porche();
		
		
		Araba[] arabalar = {b,m,p};
		double toplam = 0;
		for(int i=0;i<arabalar.length;i++)
		{
			toplam = toplam + arabalar[i].HarcananBenzinMiktari();
			
		}
		System.out.println("Arabaların toplam harcadığı benzin : "+toplam);

	}

}

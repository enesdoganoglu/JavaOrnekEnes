package com.bilgeadam.odeme;

public class KrediKarti implements IOdemeTipi{

	@Override
	public void OdemeYap(double tutar) {
		System.out.println("Kredi Kartı ile " +tutar + " TL ödeme yapıldı");
		
	}

	
	
}

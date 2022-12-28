package com.bilgeadam.odeme;

public class HavaleEft implements IOdemeTipi{

	 
	@Override
	public void OdemeYap(double tutar) {
		System.out.println("Havale / Eft  ile " +tutar + " TL ödeme yapıldı");
		
	}
	
	

}

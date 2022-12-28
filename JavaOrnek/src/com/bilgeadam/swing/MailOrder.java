package com.bilgeadam.swing;

public class MailOrder implements IOdemeTipi{

	@Override
	public String OdemeYap(double tutar) {
		// TODO Auto-generated method stub
		return "Mail Order ile " + tutar + " TL ödeme yapıldı";
	}



}

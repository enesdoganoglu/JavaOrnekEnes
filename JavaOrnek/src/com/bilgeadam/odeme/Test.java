package com.bilgeadam.odeme;

public class Test {

	public static void main(String[] args) {
		
		KrediKarti krediKarti = new KrediKarti();
		HavaleEft havaleEft = new HavaleEft();
		OdemeIslemi odemeIslemi = new OdemeIslemi(krediKarti);
		odemeIslemi.Ode(100.0);

	}

}

package com.bilgeadam.odeme;

public class OdemeIslemi {
	
	private IOdemeTipi iOdemeTipi;
	
	public OdemeIslemi(IOdemeTipi iOdemeTipi)
	{
		this.iOdemeTipi = iOdemeTipi;
	}
	
	public void Ode(double tutar)
	{
		iOdemeTipi.OdemeYap(tutar);
	}

}

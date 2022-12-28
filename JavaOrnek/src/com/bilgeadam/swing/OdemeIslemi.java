package com.bilgeadam.swing;

public class OdemeIslemi {
	
    private IOdemeTipi iOdemeTipi;
	public OdemeIslemi(IOdemeTipi iOdemeTipi)
	{
		this.iOdemeTipi = iOdemeTipi;
	}
	
	public String Ode(double tutar)
	{
		return iOdemeTipi.OdemeYap(tutar);
	}

}

package com.bilgeadam.swing;

public class OdemeIslemiFactory {
	
	
	@SuppressWarnings("deprecation")
	public IOdemeTipi create(String className) {
		
		Class c;
		IOdemeTipi iOdemeTipi = null;
		
		try {
			c = Class.forName("com.bilgeadam.swing."+className);
			//sana gelen classIsminden yeni bir nesne oluştur
			iOdemeTipi = (IOdemeTipi) c.newInstance();  //KrediKarti k = new KrediKarti();
		}
		catch(Exception ex)
		{
			ex.getStackTrace();
		}
		return iOdemeTipi;
	}

}

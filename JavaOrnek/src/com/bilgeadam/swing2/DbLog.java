package com.bilgeadam.swing2;

public class DbLog implements ILog {

	@Override
	public String LogYaz(String value) {
	
		return value +" db ye kaydedildi";
	}

}

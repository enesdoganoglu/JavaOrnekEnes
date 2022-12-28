package com.bilgeadam.solid2;

public class DbLog implements ILogger{

	@Override
	public void LogYaz(String value) {
		
		System.out.println(value + " db ye kaydedildi...");
		
	}

}

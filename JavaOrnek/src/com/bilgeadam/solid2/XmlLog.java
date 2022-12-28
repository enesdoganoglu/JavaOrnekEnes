package com.bilgeadam.solid2;

public class XmlLog implements ILogger{

	@Override
	public void LogYaz(String value) {
		
		System.out.println(value+" xml e kaydedildi");
		
	}

}

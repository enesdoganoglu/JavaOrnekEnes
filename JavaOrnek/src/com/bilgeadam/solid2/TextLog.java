package com.bilgeadam.solid2;

public class TextLog implements ILogger{

	@Override
	public void LogYaz(String value) {
		
		System.out.println(value + " text e yazıldı");
		
	}

}

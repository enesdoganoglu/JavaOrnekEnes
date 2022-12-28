package com.bilgeadam.solid2;

public class Logger {
	
	public ILogger iLogger;
	
	//Logger constructor ına ILogger interface ini implemente eden hangi class 
	// olursa olsun bunu kabul edecek Dependency injection constructor 
	public Logger(ILogger iLogger)
	{
		this.iLogger = iLogger;
	}
	
	public void Log(String value)
	{
		iLogger.LogYaz(value); //Gelen objenin içindeki ilgili metoda gider...
	}

}

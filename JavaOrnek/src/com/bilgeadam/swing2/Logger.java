package com.bilgeadam.swing2;

public class Logger {

	private ILog iLog;  //Signature
	
	Logger(ILog iLog)
	{
		this.iLog = iLog;
	}
	
	public String Log(String value)
	{
		return iLog.LogYaz(value);
	}
}

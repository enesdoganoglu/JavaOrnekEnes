package com.bilgeadam.swing2;

public class LogFactory {
	
	public  ILog create(String className)
	{
		Class c;
		ILog iLog = null;
		try
		{
			c = Class.forName("com.bilgeadam.swing2."+className);
			iLog = (ILog)c.newInstance(); //DbLog dbLog = new DbLog(); oluşturduğun nesneyi iLog interface tipine dönüştür
			
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
		return iLog;
	}

}

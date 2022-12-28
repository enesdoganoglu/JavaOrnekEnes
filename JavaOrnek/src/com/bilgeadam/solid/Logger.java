package com.bilgeadam.solid;

public class Logger {

	public DbLog dbLog;
	public XmlLog xmlLog;
	public TextLog textLog;
	
	public Logger(DbLog dbLog, XmlLog xmlLog,TextLog textLog)
	{
		this.dbLog = dbLog;
		this.xmlLog = xmlLog;
		this.textLog = textLog;
	}
	
	public void Log(LogType type, String value)
	{
		switch(type)
		{
		case Db:
		     dbLog.LogYaz(value);
		     break;
		case Xml:
			xmlLog.LogYaz(value);
			break; 
		case Text:
			textLog.LogYaz(value);
			break;
		}
	}
}

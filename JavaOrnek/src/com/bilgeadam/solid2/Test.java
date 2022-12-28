package com.bilgeadam.solid2;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DbLog dbLog = new DbLog();
		XmlLog xmlLog = new XmlLog();
		TextLog textLog = new TextLog();
		Logger logger = new Logger(xmlLog);
		logger.Log("303 Nolu Hata Kodu : ");
		

	}

}

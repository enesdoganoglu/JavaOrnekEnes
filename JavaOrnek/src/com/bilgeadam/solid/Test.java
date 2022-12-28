package com.bilgeadam.solid;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DbLog dbLog = new DbLog();
		XmlLog xmlLog = new XmlLog();
		TextLog textLog = new TextLog();
		Logger logger = new Logger(dbLog,xmlLog,textLog);
		logger.Log(LogType.Text, "303 Nolu Hata kodu oluştu : ");

	}

}

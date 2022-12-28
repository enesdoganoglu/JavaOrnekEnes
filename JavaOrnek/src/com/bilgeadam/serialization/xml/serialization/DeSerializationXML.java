package com.bilgeadam.serialization.xml.serialization;

import java.beans.XMLDecoder;
import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class DeSerializationXML {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		XMLDecoder decoder = null;
		try
		{
			
			//Kafa(new Goz("mavi"),new Kulak("sekil"),new Burun("sekil"))
			
			decoder = new XMLDecoder
					(new BufferedInputStream
							(new FileInputStream("C:\\bilgeadam\\dosya.xml")));
			DVD movieList = (DVD)decoder.readObject();
			System.out.println(movieList.toString());
			
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		

	}

}

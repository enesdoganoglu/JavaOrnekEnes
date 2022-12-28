package com.bilgeadam.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationYaz {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		try
		{
		Kisi kisi = new Kisi("İbrahim","Gökyar");
		FileOutputStream dosya = new FileOutputStream("C:\\bilgeadam\\dosya.txt");
		ObjectOutputStream yaz = new ObjectOutputStream(dosya); 
		yaz.writeObject(kisi);
		yaz.close();
		System.out.println("Dosyaya yazıldı");
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}

	}

}

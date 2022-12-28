package com.bilgeadam.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializationOku {

	public static void main(String[] args) throws IOException {
		try
		{
			FileInputStream dosya = new FileInputStream("C:\\bilgeadam\\dosya.txt");
			ObjectInputStream oku = new ObjectInputStream(dosya);
			Kisi kisi = (Kisi)oku.readObject();
			System.out.println(kisi.toString());
			oku.close();
			
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}
}

package com.bilgeadam.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DosyayaYaz {


	public static void main(String[] args) {
		String dosyaYolu = "C:\\bilgeadam\\io\\deneme.txt";
		File file = new File(dosyaYolu);
		try
		{
			if(file.exists())
			{
				FileWriter fileWriter = new FileWriter(dosyaYolu,true);
				BufferedWriter bufferedWriter= new BufferedWriter(fileWriter);
				bufferedWriter.write("Merhaba Dünya");
				bufferedWriter.close();
				System.out.println("Dosyaya yazma işlemi başarılı");
				
			}
		}
		catch(Exception e)
		{
		    e.printStackTrace();
		}

	}

}

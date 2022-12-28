package com.bilgeadam.io;

import java.io.File;

public class DosyaOlustur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dosyaYolu = "C:\\bilgeadam\\io\\deneme.txt";
		try
		{
		
			File file = new File(dosyaYolu);
			if(file.exists())
			{
				System.out.println("Dosya zaten var...");
			}
			else
			{
				if(!file.createNewFile()) {
					System.out.println("Dosya oluşturulurken hata oluştu");
				}
				else
				{
					System.out.println("Dosya oluşturuldu");
				}
				
			}
			
		}
		catch(Exception ex)
		{
			
		}

	}

}

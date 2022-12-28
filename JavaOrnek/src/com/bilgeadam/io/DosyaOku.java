package com.bilgeadam.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DosyaOku {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		String dosyaYolu = "C:\\bilgeadam\\io\\deneme.txt";
		
			try {
				FileReader fileReader = null;
				fileReader = new FileReader(dosyaYolu);
				String line;
				BufferedReader bufferedReader = new BufferedReader(fileReader);
			
				while((line = bufferedReader.readLine())!= null )
				{
					System.out.println(line);
				}
			} catch (FileNotFoundException e1) {

				System.out.println("Dosya bulunamadı");
				//e1.printStackTrace();
			}
			catch (Exception e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				System.out.println("Dosya okuma hatası");
			}
			
			
		}
		
	}


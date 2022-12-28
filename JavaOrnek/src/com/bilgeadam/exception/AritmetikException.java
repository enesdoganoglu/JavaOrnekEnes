package com.bilgeadam.exception;

public class AritmetikException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			//çalışmasını düşündüğüm kodları bu kısma yazıyorum
			int a = 5, b = 0;
			int c = a/b;
		}
		catch(ArithmeticException ex)
		{
			System.out.println("Sıfıra bölme hatası lütfen girdilerinizi kontrol ediniz");
		}
		

		
	}

}

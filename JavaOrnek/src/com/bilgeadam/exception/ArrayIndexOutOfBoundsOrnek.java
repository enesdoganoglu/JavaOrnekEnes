package com.bilgeadam.exception;

public class ArrayIndexOutOfBoundsOrnek {
	
	public static void main(String[] args) {
		String[] gunler = new String[7];
		
		try
		{
		int a[] = new int[8];
		a[3] =10;
		a[8] = 20;
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("Listeye eklemek isdeğiniz değer bulunamadı...");
		}
		
	}

}

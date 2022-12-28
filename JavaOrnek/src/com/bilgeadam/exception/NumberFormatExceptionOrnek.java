package com.bilgeadam.exception;

import java.util.Scanner;

public class NumberFormatExceptionOrnek {
	
	public static void main(String[] args) {
		System.out.println("Bir sayı giriniz");
		try
		{
		Scanner scn= new Scanner(System.in);
		String sayi = scn.nextLine();
		int i = Integer.parseInt(sayi);
		}
		catch(NumberFormatException ex)
		{
			System.out.println("Lütfen sadece sayı giriniz");
		}

	}

}

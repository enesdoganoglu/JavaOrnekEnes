package com.bilgeadam.exception;

public class NullPointerException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String isim = "ibrahim";
		System.out.println(isim.length());
		
		String isim2 = null;
		System.out.println(isim2.length());
		isim2 = "Hakan";

	}

}

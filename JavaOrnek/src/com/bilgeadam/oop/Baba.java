package com.bilgeadam.oop;


import com.bilgeadam.interfaces.IOzellik;
import com.bilgeadam.interfaces.IOzellik2;

public class Baba extends Insan implements IOzellik,IOzellik2{
	
	
	@Override
	public void Oku(String adi) {
		// TODO Auto-generated method stub
		System.out.println(adi + " okuyor...");
		
	}

	@Override
	public void Dinle(String adi) {
		// TODO Auto-generated method stub
		System.out.println(adi +" dinliyor...");
		
	}

	@Override
	public void Kokla(String adi) {
		// TODO Auto-generated method stub
		
	}
  
}

package com.bilgeadam.oop;
import com.bilgeadam.interfaces.IOzellik;

//Anne class ı Insan classından türemiştir
//Insan Class ındaki tüm public olan
// metot ve değişkenlere anne classı da erişebilir
public class Anne extends Insan implements IOzellik {

	@Override
	public void Oku(String adi) 
	{
	
		System.out.println(adi +" okuyor...");
		
	}

	@Override
	public void Kokla(String adi) {
		// TODO Auto-generated method stub
		
	}

	

	
	
}

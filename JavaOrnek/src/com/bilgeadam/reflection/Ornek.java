package com.bilgeadam.reflection;

public class Ornek {
	
	private int sayi;
	
	public void goster() {
		System.out.println("goster() aldığı parametre yok");
	}
	
	public String gosterString(String temp) {
		System.out.println("gosterString() String parametresi"+temp);
		return temp;
	}
	
	public int gosterInteger(int temp)
	{
		System.out.println("gosterInteger() Integer parametresi"+temp);
		return temp;
	}
	
	public void setSayi(int sayi) {
		this.sayi = sayi;
		System.out.println("setSayi() setlenen sayi "+sayi);
		
	}
	
	public void gosterSayi()
	{
		System.out.println("setlenen sayi : "+this.sayi);
	}

}

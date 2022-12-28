package com.bilgeadam.constructor2;

public class Kasa {
	
	public Marka marka;
	public Model model;
	public Kapi kapi;
	public Pencere pencere;
	public String kasaTipi;
	
	
	public Kasa(Marka marka,Model model,Kapi kapi,Pencere pencere,String kasaTipi)
	{
		this.marka = marka;
		this.model = model;
		this.pencere = pencere;
		this.kapi = kapi;
		this.kasaTipi = kasaTipi;
	}
	

}

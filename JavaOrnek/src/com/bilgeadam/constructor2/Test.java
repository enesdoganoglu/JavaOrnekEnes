package com.bilgeadam.constructor2;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Marka marka = new Marka("Porche");
		Model model = new Model("Carrera");
		Kapi kapi = new Kapi(4);
		Pencere pencere = new Pencere(4);
		
		Kasa kasa = new Kasa(marka,model,kapi,pencere,"Sedan");
		Araba araba = new Araba(kasa,1000000);
		araba.EkranaYaz();
		
		//Test.java nın swing sayfasının oluşturucaz

	}

}

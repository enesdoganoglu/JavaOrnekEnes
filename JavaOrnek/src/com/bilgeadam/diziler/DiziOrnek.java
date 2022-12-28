package com.bilgeadam.diziler;

import java.util.ArrayList;
import java.util.Date;

public class DiziOrnek {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		//1. yöntem 
		String[] gunler = new String[7];
		gunler[0] = "Pazartesi";
		gunler[1] = "Salı";
		gunler[2] = "Çarşamba";
		gunler[3] = "Perşembe";
		gunler[4] = "Cuma";
		gunler[5] = "Cumartesi";
		gunler[6] = "Pazar";
		
		ArrayList liste = new ArrayList();
		
		liste.add("ibrahi");
		
		for(int i= 0; i<gunler.length;i++)
		{
			System.out.println(gunler[i]);
		}
		
		Date d = new Date();

	}

}

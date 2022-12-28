package com.bilgeadam.paketornek;

import com.bilgeadam.paket1.Matematik;
import com.bilgeadam.paket1.Yaziyaz;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Matematik.toplamaSinifi t = new Matematik().new toplamaSinifi();
		Matematik.cikarmaSinifi c = new Matematik().new cikarmaSinifi();
		System.out.println("Toplam : "+t.topla(5, 5));
		
        Yaziyaz y1 = new Yaziyaz();
        com.bilgeadam.paket2.Yaziyaz y2 = new com.bilgeadam.paket2.Yaziyaz();
        y1.Yaz();
        y2.Yaz();
	}

}

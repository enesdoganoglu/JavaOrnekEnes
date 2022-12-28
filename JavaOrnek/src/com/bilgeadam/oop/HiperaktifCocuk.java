package com.bilgeadam.oop;

import com.bilgeadam.interfaces.IEhliyetAl;

public class HiperaktifCocuk extends Cocuk implements IEhliyetAl {

	@Override
	public void EhliyetAl(String adi) {
		System.out.println(adi + " ehliyet alıyor...");
		
	}

}

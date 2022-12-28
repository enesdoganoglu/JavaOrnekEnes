package com.bilgeadam.oop;

import com.bilgeadam.interfaces.IEhliyetAl;
import com.bilgeadam.interfaces.IAskereGit;

public class UsluCocuk extends Cocuk implements IAskereGit,IEhliyetAl{

	@Override
	public void EhliyetAl(String adi) {
		System.out.println(adi + " ehliyet alıyor...");
		
	}

	@Override
	public void AskereGit(String adi) {
		System.out.println(adi + " askere gidiyor...");
		
	}

}

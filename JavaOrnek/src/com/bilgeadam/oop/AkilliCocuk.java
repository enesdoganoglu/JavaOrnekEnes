package com.bilgeadam.oop;

import com.bilgeadam.interfaces.IAskereGit;
import com.bilgeadam.interfaces.IEhliyetAl;
import com.bilgeadam.interfaces.IKlubeGit;

public class AkilliCocuk extends Cocuk implements IAskereGit,IEhliyetAl,IKlubeGit {

	@Override
	public void AskereGit(String adi) {
	
		System.out.println(adi + " askere gidiyor...");
		
	}

	@Override
	public void EhliyetAl(String adi) {
	
		System.out.println(adi + " ehliyet alıyor...");
		
	}

	@Override
	public void KlubeGit(String adi) {
		System.out.println(adi + " klube gidiyor...");
		
	}

}

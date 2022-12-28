package com.bilgeadam.collection;

public class Kare<T extends Number> {

	public double alanHesapla(T uzunluk) {
		return uzunluk.doubleValue() * uzunluk.doubleValue();
	}
}

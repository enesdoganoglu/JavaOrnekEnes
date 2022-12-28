package com.bilgeadam.collection;

import java.util.Dictionary;
import java.util.Hashtable;

public class Sozluk<K,V> {
	
	private Dictionary<K,V> sozluk = new Hashtable<K,V>();
	
	public void ekle(K anahtar,V deger)
	{
		this.sozluk.put(anahtar, deger);
	}
	
	public V getir(K anahtar)
	{
		return this.sozluk.get(anahtar);
	}
	

}

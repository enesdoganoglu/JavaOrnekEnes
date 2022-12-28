package com.bilgeadam.collection;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class DictionaryOrnek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sozluk<Integer,String> sozluk= new Sozluk<Integer,String>();
		sozluk.ekle(34, "İstanbul");
		sozluk.ekle(06, "Ankara");
		sozluk.ekle(35, "İzmir");
		
		System.out.println("34 plaka kodu hangi ilin "+sozluk.getir(34));
		
		Hashtable<Integer,String> iller= new Hashtable<Integer,String>();
		iller.put(34, "İstanbul");
		iller.put(06, "Ankara");
		iller.put(35, "İzmir");
		
		List<Integer> listKeys = new ArrayList<Integer>( iller.keySet() );
		 
		System.out.println("Tüm plaka kodları: " + listKeys);
		
		List<String> listValues = new ArrayList<String>( iller.values() );
		 
		System.out.println("Tüm iller: " + listValues);
		
	}

}

package com.bilgeadam.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetOrnek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> setNesne = new HashSet<String>();
		setNesne.add("Matematik");
		setNesne.add("Fen Bilgisi");
		setNesne.add("Fizik");
		setNesne.add("Biyoloji");
		//setNesne.add("Matematik");
		//setNesne.add("Matematik");
		//setNesne.remove("Matematik");
		//System.out.println(setNesne.contains("Biyoloji"));
		//System.out.println("Listedeki eleman sayısı : "+setNesne.size());
		
		//Iterator<String> iterator = setNesne.iterator();
		//while(iterator.hasNext()) {
			//String name = iterator.next();
			//System.out.println(name);
		///}
		
		Iterator<String> iterator2 = setNesne.iterator();
		for(String name : setNesne) {
			System.out.println(name);
		}
		
		
		Iterator<String> iterator3 = setNesne.iterator();
		setNesne.forEach(System.out::println);
		
		
		
		
		

	}

}

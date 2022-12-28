package com.bilgeadam.collection;

import java.util.ArrayList;
import java.util.List;

public class ClassCastExceptionOrnek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		list.add("Merhaba Dünya");
		list.add("aaa");
		list.add("aaa");
		
		for (int i = 0; i < list.size(); i++) {
		
		
		System.out.println(list.get(i));
		
		}


	}

}

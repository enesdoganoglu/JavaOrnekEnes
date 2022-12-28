package com.bilgeadam.serialization.xml.serialization;

import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Movie> movieList = new ArrayList<Movie>();
		
		Movie m1 = new Movie("Film1","120","Nolan",2002,"Alpacino");
		movieList.add(m1);
		movieList.add(new Movie("Film2","110","yönetmen2",2002,"Leonardo"));
		movieList.add(new Movie("Film3","100","yönetmen3",2002,"Oyuncu3"));
		
		DVD dvd = new DVD();
		dvd.setMovies(movieList);
		
		XMLEncoder encoder = null;
		try
		{
			encoder = new XMLEncoder
					(new BufferedOutputStream(new FileOutputStream("C:\\bilgeadam\\dosya.xml")));
			encoder.writeObject(dvd);
			encoder.close();
			System.out.println("serialize edildi");
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
			
		}
		

	}

}

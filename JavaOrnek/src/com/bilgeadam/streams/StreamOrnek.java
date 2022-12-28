package com.bilgeadam.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;


public class StreamOrnek {

	public static void main(String[] args) {
		
	
		  
		  List<String> list = Arrays.asList("ibrahim","Hakan","Mehmet","Hüseyin","Ali","Su");

	      List<String> collect = list.stream().
	    		                    filter(x -> x.length()< 4).collect(Collectors.toList());

	       System.out.println(collect);
	       
	     
	       Stream upperCaseStream = list.stream().map(isim -> isim.toUpperCase());
	       List<String> upperIsimler =  (List<String>) upperCaseStream.collect(Collectors.toList());
	       
	       upperIsimler.forEach(System.out::println);
	       
	       IntStream streamSayilar = IntStream.of(1,1,2,3,3,4,7,13,13,7); //1,2,3,4,7,13
	       streamSayilar.distinct()
	       .forEach(System.out::println);
	       
	       
	       LongStream range = LongStream.range(1, 25000);
	       range.limit(10)
	       .forEach(System.out::println);
	       
	       
	       
	       
	       
	       

	}

}

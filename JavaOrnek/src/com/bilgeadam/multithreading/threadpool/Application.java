package com.bilgeadam.multithreading.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Application {
	
	
	public static void main(String[] args) {
		
		ExecutorService executorService = Executors.newFixedThreadPool(4);
		
		for(int i=1; i<=4; i++) {
			executorService.submit(new Processor(i));
		}
		executorService.shutdown();
		
		System.out.println("Tüm görevler eklendi");
		
		try {
			executorService.awaitTermination(1, TimeUnit.DAYS);
		}
		catch(InterruptedException ex) {
			System.out.println(ex.getMessage());
		}
		System.out.println("Tüm görevler tamamlandı...");
		
		
		
		
		
	}
	
	

}

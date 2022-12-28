package com.bilgeadam.multithreading;

public class Main {

	public static void main(String[] args) {
		
		ThreadOrnek t1 = new ThreadOrnek();
		ThreadOrnek t2 = new ThreadOrnek();
		
			
		
		   t1.start();
		   t2.start();
		   
		   Thread thread1 = new Thread(new Runner());
		   Thread thread2 = new Thread(new Runner());
		   thread1.start();
		   thread2.start();
		   
		   Thread threadLambda = new Thread(()-> System.out.println("Merhaba Dünya Lamda"));
		   threadLambda.start();
	}
}

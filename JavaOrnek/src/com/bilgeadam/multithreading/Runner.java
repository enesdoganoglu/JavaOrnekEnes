package com.bilgeadam.multithreading;

public class Runner implements Runnable {

	@Override
	public void run() {
		
		for(int i= 0; i<3; i++)
		{
			System.out.println("Merhaba Örnek "+i);
			
		}
	}

}

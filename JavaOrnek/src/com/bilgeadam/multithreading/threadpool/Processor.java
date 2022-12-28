package com.bilgeadam.multithreading.threadpool;

public class Processor implements Runnable {

	private int id;
	
	public Processor(int id)
	{
		this.id = id;
		
	}
	@Override
	public void run() {
	
		System.out.println("Başlıyor... "+id);
		
		try {
			Thread.sleep(5000);
			System.out.println("Tamamlandı : "+id);
		}
		catch(InterruptedException e) {
			
		}
		
	}
	

}

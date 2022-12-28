package com.bilgeadam.multithreading.threadpool;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountDownLatchApplication {

	public static void main(String[] args) {
		
		CountDownLatch latch =  new CountDownLatch(3);
		ExecutorService executorService = Executors.newFixedThreadPool(3);
		for (int i = 0; i < 3; i++) {
			executorService.submit(new Thread(new ProcessorLatch(latch)));
		}
		try {
			latch.await();
		}catch(InterruptedException e)
		{
			
		}
		System.out.println("Program bitti");
		
	}

}

class ProcessorLatch implements Runnable {
	
	private CountDownLatch latch;
	
	public ProcessorLatch(CountDownLatch latch)
	{
		this.latch = latch;
	}
	@Override
	public void run() {
		System.out.println("Thread Başladı");
		try {
			Thread.sleep(5000);
		}catch(InterruptedException e)
		{
			
		}
		latch.countDown();
	}
	
	
}

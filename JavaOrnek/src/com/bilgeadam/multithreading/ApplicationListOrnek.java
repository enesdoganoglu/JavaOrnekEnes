package com.bilgeadam.multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ApplicationListOrnek {

	private Object lock1 = new Object();
	private Object lock2 = new Object();
	
	private List<Integer> list1 = new ArrayList<>();
	private List<Integer> list2 = new ArrayList<>();

	public static void main(String[] args) {

		ApplicationListOrnek app = new ApplicationListOrnek();
		long startTime = System.currentTimeMillis();
		app.work();
		long endTime = System.currentTimeMillis();
		System.out.println("Geçen Zaman : " + (endTime - startTime));
		System.out.println("List 1'in boyutu "+app.list1.size());
		System.out.println("List 2'in boyutu "+app.list2.size());
	}

	private void work() {
		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				IslemYap();
			}
		});
		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				IslemYap();
			}
		});
		thread1.start();
		thread2.start();
		
		try {
			thread1.join();
			thread2.join();
		}
	catch(InterruptedException ex)
		{
		  System.out.println(ex.getMessage());
		}
	}
	private void IslemYap() {
		for (int i = 0; i < 1000; i++) {
			addNewIntegerToList1();
			addNewIntegerToList2();
		}
	}
	private void addNewIntegerToList1() {
		synchronized(lock1) {
		try {
			Thread.sleep(1);
			;
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		list1.add(new Random().nextInt());
		}
	}

	private void addNewIntegerToList2() {
		synchronized(lock2) {
		try {
			Thread.sleep(1);
			;
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		list2.add(new Random().nextInt());
		}
	}

}


package com.bilgeadam.multithreading.threadpool;

public class Main {
	public static void main(String[] args) {
		Processor p = new Processor(1);
		p.run();
	}

}

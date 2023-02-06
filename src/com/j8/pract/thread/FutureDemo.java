package com.j8.pract.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FutureDemo {

	public static void main(String[] args) {

		//ExecutorService service=Executors.newFixedThreadPool(10);
		
		Runnable t1= new Runnable() {
			@Override
			public void run() {
				System.out.println(" Hello");
			}
		};
		
		Runnable t2= new Runnable() {
			@Override
			public void run() {
				System.out.println(" World");
			}
		};
		
		t1.run();
		t2.run();
		
		
//		Future<List<Integer>> future = service.s
	}

}

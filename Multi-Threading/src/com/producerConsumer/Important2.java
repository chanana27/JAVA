// Optimized way of the code in Important.java 
package com.producerConsumer;

class DemoImportant2 extends Thread{
	int total = 0;
	
	public void run() {
		synchronized(this) {
			System.out.println("User thread starts the calculation");
			for(int i=0; i<=100; i++) {
				total+=i;
			}
			System.out.println("User thread is giving the notification call");
			this.notify();
		}
		
	}
}

public class Important2 {

	public static void main(String[] args) throws InterruptedException {
		
		DemoImportant2 obj = new DemoImportant2();
		obj.start();
		
		synchronized(obj) {
			System.out.println("Main thread is calling the wait method");
			obj.wait();
			System.out.println("Main thread got the notification call");
			System.out.println(obj.total);
		}
	}

}

// use of synchronized block
package com.multithread;

class Temp1 implements Runnable{
	public void run() {
		
		for(int i=0; i<5; i++) {
			System.out.println(i);
		}
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		synchronized (this) {
			System.out.println(Thread.currentThread().getName());
			for(int i=0; i<5; i++) {
				System.out.print((char) (i+65) + " ");
			}
			System.out.println();
		}
	}
}

public class LaunchMT1 {

	public static void main(String[] args) {
		Temp1 obj = new Temp1();
		
		Thread t1 = new Thread(obj);
		Thread t2 = new Thread(obj);
		Thread t3 = new Thread(obj);
		
		t1.start();
		t2.start();
		t3.start();
	}

}

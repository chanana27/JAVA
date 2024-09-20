// Multithreading using Runnable Interface
package com.multithread;


class Banking1 implements Runnable{
	public void run() {
		System.out.println("Starting Banking application");
		for(int i=0; i<3; i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Doing Banking Task");
		}
		System.out.println("Done with Banking Task");
	}
}

class Printing1 implements Runnable{
	public void run() {
		System.out.println("Starting Printing application");
		for(int i=0; i<3; i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Doing Printing Task");
		}
		System.out.println("Done with Printing Task");
	}
}

class Calculation1 implements Runnable{
	public void run() {
		System.out.println("Starting Calculation application");
		for(int i=0; i<3; i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Doing Calculation Task");
		}
		System.out.println("Done with Calculation Task");
	}
}

public class sample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Banking1 a1 = new Banking1();
		Printing1 a2 = new Printing1();
		Calculation1 a3 = new Calculation1();
		
		Thread t1 = new Thread(a1);
		Thread t2 = new Thread(a2);
		Thread t3 = new Thread(a3);
		
		t1.start(); t2.start(); t3.start();
	}

}

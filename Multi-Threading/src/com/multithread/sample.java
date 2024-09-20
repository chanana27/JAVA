// Mutlithreading using thread class.
package com.multithread;

class Banking extends Thread{
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

class Printing extends Thread{
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

class Calculation extends Thread{
	public void run() {
		System.out.println("Starting Calc application");
		for(int i=0; i<3; i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Doing Calc Task");
		}
		System.out.println("Done with Calc Task");
	}
}

public class sample {
	public static void main(String[] args) {
		Banking a1 = new Banking();
		Printing a2 = new Printing();
		Calculation a3 = new Calculation();
		
		a1.start();
		a2.start();
		a3.start();
	}
}

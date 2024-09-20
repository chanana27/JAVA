// Use of Synchronized and block state in multithreading and Deadlock Example.
package com.multithread;

class Battle implements Runnable{
	String res1 = new String("Pashupatastra");
	String res2 = new String("Brahmastra");
	String res3 = new String("Darastra");
	
	public void run() {
		String s = Thread.currentThread().getName();
		if(s.equals("Rama")) {
			ramaAcqResources();
			
		}
		else {
			ravanaAcqResources();
		}
	}
	
	public void ramaAcqResources() {
		try {
			Thread.sleep(3000);
			synchronized(res1) {
				System.out.println("Rama has acquired resource 1 " + res1);
				Thread.sleep(3000);
				synchronized(res2) {
					System.out.println("Rama has acquired resource 2 " + res2);
					Thread.sleep(3000);
					synchronized(res3) {
						System.out.println("Rama has acquired resource 3 " +res3);
					}
				}
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void ravanaAcqResources() {
		try {
			Thread.sleep(3000);
			synchronized(res3) {
				System.out.println("Ravana has acquired resource 3 " + res3);
				Thread.sleep(3000);
				synchronized(res2) {
					System.out.println("Ravana has acquired resource 2 " + res2);
					Thread.sleep(3000);
					synchronized(res1) {
						System.out.println("Ravana has acquired resource 1 " +res1);
					}
				}
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}

public class LaunchMT2 {

	public static void main(String[] args) {
		
		Battle b = new Battle();
		
		Thread t1 = new Thread(b);
		Thread t2 = new Thread(b);
		
		t1.setName("Rama");
		t2.setName("Ravana");
		
		t1.start();
		t2.start();
	}
}

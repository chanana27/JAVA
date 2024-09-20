// Race condition in Multithreading and solution using synchronized keyword. If we remove the synchornized keyword race condition would happen.
package com.multithread;

class Bathroom implements Runnable {
	 synchronized public void run() {
		try {
			System.out.println(Thread.currentThread().getName() + " has entered the bathroom");
			Thread.sleep(3000);			
			System.out.println(Thread.currentThread().getName() + " is using the bathroom");
			Thread.sleep(3000);
			System.out.println(Thread.currentThread().getName() + " has exited the bathroom");
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}

public class LaunchMT {

	public static void main(String[] args) {
		Bathroom b = new Bathroom();
		
		Thread t1 = new Thread(b);
		Thread t2 = new Thread(b);
		Thread t3 = new Thread(b);
		
		t1.setName("BOY");
		t2.setName("GIRL");
		t3.setName("TIKTOKER");
		
		t1.start();
		t2.start();
		t3.start();

	}

}

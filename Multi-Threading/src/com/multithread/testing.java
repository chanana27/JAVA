package com.multithread;

class testing2 implements Runnable{
	public void run() {
		
		if(Thread.currentThread().getName().equals("first"))
			m1();
		else
			m2();
	}
	public synchronized void m1() {
		System.out.println("inside m1");
		try {
			Thread.sleep(4000);			
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("work done in m1");
	}
	
	public synchronized void m2() {
		System.out.println("inside m2221");
		try {
			Thread.sleep(4000);			
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("work done in m2");
	}
	
	public static synchronized void m3() {
//		try {
//			Thread.sleep(4000);			
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
		System.out.println("work done in m3");
	}
	
	public synchronized void m4() {
//		try {
//			Thread.sleep(4000);			
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
		System.out.println("work done in m4");
	}
	
	public void m5() {
//		try {
//			Thread.sleep(4000);			
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
		System.out.println("work done in m5");
	}
}


public class testing {

	public static void main(String[] args) {
		testing2 obj = new testing2();
		
		Thread t1 = new Thread(obj);
		Thread t2 = new Thread(obj);
		Thread t3 = new Thread(obj);
		Thread t4 = new Thread(obj);
		Thread t5 = new Thread(obj);
		
		t1.setName("first");
		t2.setName("Second");

		t1.start();
		t2.start();
//		t3.start();
//		t4.start();
//		t5.start();
	}

}

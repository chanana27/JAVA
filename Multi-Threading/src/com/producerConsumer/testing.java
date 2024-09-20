package com.producerConsumer;

class testingDemo extends Thread{
	public void run() {
		System.out.println("running");
	}
}
public class testing {

	public static void main(String[] args)throws Exception {
		testingDemo obj = new testingDemo();
		obj.start();
		Thread.sleep(0);
		System.out.println("main thread is running");

	}

}

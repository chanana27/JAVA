package com.producerConsumer;

class DemoImportant extends Thread{
	int total = 0;
	
	public void run() {
		for(int i=0; i<=100; i++) {
			total += i;
		}
		System.out.println("hello ");
	}
	
}

public class Important {	

	public static void main(String[] args) throws Exception{

		DemoImportant obj = new DemoImportant();
		obj.start();
		
		
		System.out.println(obj.total);
	}	

}

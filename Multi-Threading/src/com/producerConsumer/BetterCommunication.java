package com.producerConsumer;

class Producer1 extends Thread{
	
		//Producer producing the data in StringBuffer
		StringBuffer sb;
		
		public Producer1() {
			//String Buffer object is created with a default value 16
			sb = new StringBuffer();
		}
		
		public void run() {
			
			synchronized(sb) {
				for(int i=0; i<= 10; i++) {
					try {
						sb.append(i + ": ");
						Thread.sleep(100);
						System.out.println("Appending");
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				sb.notify();
		}
	}	
}

class Consumer1 extends Thread{
	
	// creating prouder object to get the produced data from StringBuffer
	Producer1 producer;
	
	// constructor injection
	public Consumer1(Producer1 producer) {
		this.producer = producer;
	}
	
	public void run() {
		// check for producer dataProvider, if true only consume the data else enter into sleeping state
		
		synchronized(producer.sb) {
				
				try {
					// wait till the notification is sent by producer
					producer.sb.wait();
					//consume the data produced by producer
					System.out.println(producer.sb);
				}catch(Exception e) {
					e.printStackTrace();
				}
		}
	}
}




public class BetterCommunication {

	public static void main(String[] args) {
		
		Producer1 producer = new Producer1();
		Consumer1 consumer = new Consumer1(producer);
		
		
		Thread t1 = new Thread(producer);
		Thread t2 = new Thread(consumer);
		
		t2.start();
		t1.start();
	}

}

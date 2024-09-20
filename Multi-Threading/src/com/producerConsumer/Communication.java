package com.producerConsumer;

class Producer extends Thread{
	
		//Producer producing the data in StringBuffer
		StringBuffer sb;
		
		//variable used by thread for communication
		boolean dataProvider = false;
		
		public Producer() {
			//String Buffer object is created with a default value 16
			sb = new StringBuffer();
		}
		
		public void run() {
			for(int i=0; i<10; i++) {
				try {
					sb.append(i + ": ");
					Thread.sleep(100);
					System.out.println("Appending");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			dataProvider = true;
		}
		
}

class Consumer extends Thread{
	
	// creating prouder object to get the produced data from StringBuffer
	Producer producer;
	
	public Consumer(Producer producer) {
		this.producer = producer;
	}
	
	public void run() {
		// check for producer dataProvider, if true only consume the data else enter into sleeping state
		while(producer.dataProvider == false) {
			try {
				Thread.sleep(10);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		//consume the data produced by producer
		System.out.println(producer.sb);
	}
}



public class Communication {

	public static void main(String[] args) {
		
		Producer producer = new Producer();
		Consumer consumer = new Consumer(producer);
		
		
		Thread t1 = new Thread(producer);
		Thread t2 = new Thread(consumer);
		
		t2.start();
		t1.start();
	}

}

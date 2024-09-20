package com.producerConsumer;

/*class TestLambda extends Thread{
	public void run() {
		for(int i=0; i<=5; i++) {
			System.out.println("User Thread");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}*/

public class lambdaImplementation {

	public static void main(String[] args) {
		
//		TestLambda obj = new TestLambda(); normal way begineer's way
//		obj.start();
		
		/*new Thread(new Runnable() {
			public void run() {
				for(int i=0; i<=5; i++) {
					System.out.println("User Thread");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}).start(); */ // Anonymous class way 
		
		// Lambda Expression way
		new Thread(()->{
			for(int i=0; i<=5; i++) {
				System.out.println("User Thread");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}).start();
		
		for(int i=0; i<=5; i++) {
			System.out.println("Main Thread");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}

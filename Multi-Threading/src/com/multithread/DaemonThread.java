package com.multithread;

class DaemonExample implements Runnable{
	public void run() {
		for(int i=0; i<4; i++) {
			System.out.println(i);
			try {
				Thread.sleep(3000);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}

public class DaemonThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DaemonExample d = new DaemonExample();
		Thread t1 = new Thread(d);
		t1.start();
		t1.setDaemon(true);

	}

}

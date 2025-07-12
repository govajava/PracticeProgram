package com.practice.programes;
class T3 extends Thread{
	 public void run(){
		 for(int i=0;i<100;i++) {
			 System.out.println("loki");
			 try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		 }
		 
	 }
}
class T4 extends Thread{
	 public void run(){
		 for(int i=0;i<100;i++) {
			 System.out.println("gova");
			 try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		 }
		 
	 }
}


public class ThreadPriorityAndSleep {

	public static void main(String[] args) {
		T3 t1= new T3();
		T4 t2= new T4();
		t1.start();
		try {
			t1.sleep(2);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		t2.start();
		try {
			t2.sleep(2);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
	}

}

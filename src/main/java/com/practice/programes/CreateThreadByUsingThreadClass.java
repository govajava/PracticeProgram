package com.practice.programes;

class Thread1 extends Thread{
	public void run() {
		System.out.println("thread created by using Thread class");
	}
}

public class CreateThreadByUsingThreadClass {

	public static void main(String[] args) {
	  Thread1 t1= new Thread1();
	  t1.start();

	}

}

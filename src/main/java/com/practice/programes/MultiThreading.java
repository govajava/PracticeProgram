package com.practice.programes;
//Multi thread means at a time can perform more than one thread is known as multithreading.
 class T1 extends Thread{
	 public void run(){
		 for(int i=0;i<100;i++) {
			 System.out.println("loki");
		 }
		 
	 }
 }
 class T2 extends Thread{
	 public void run(){
		 for(int i=0;i<100;i++) {
			 System.out.println("gova");
		 }
		 
	 }
 }
 

public class MultiThreading {

	public static void main(String[] args) {
		T1 t1= new T1();
		T2 t2= new T2();
		t1.start();
		t2.start();
		}

}

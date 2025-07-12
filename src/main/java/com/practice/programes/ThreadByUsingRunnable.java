package com.practice.programes;

import java.io.IOException;
import java.nio.CharBuffer;

 class Threadd implements Runnable{

	public void run() {
		System.out.println("thread created by implementing runnble interface");
	}
	
	
}

public class ThreadByUsingRunnable {

	public static void main(String[] args) {
		Runnable obj= new Threadd();
		 Thread t= new Thread(obj);
		 t.start();
		}

	}



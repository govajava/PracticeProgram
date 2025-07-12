package com.practice.programes;


enum Status{
	pending,sucess,failure,running;
}

public class Demo {

	public static void main(String[] args) {
		Status s=  Status.failure;
		if(s==Status.failure) {
			System.out.println("failed!");
		}
		else if(s==Status.pending ) {
			System.out.println("please wait...");
		}
		else if(s== Status.running) {
			System.out.println("All good");
		}
		else
			System.out.println("Done");

	}

}

package com.practice.programes;

public class AnnamousObject {
	
	//NOTE : this comments are written by me  for better understanding  whenever i see code second time
    //    don't think this it is copy paste.
	
	// Anonymous object is it has no reference. the problem with this is we can't reuse them. we can use only when it'srequried
	
	
	public AnnamousObject() {
		System.out.println("object created");
	}
	public void show() {
		System.out.println("it showed");
	}

	public static void main(String[] args) {
		 new AnnamousObject().show();

	}

}

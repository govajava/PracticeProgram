package com.practice.programes;
 // Interface does contain all abstract methods 
// by default in interface all methods are public but not the fields.
// By default fields are static and final.
// class can implements multiple interfaces.
// can interface extends other interface.

// class to class => extend
// class to interface => implements
// interface to interface => extends


 public interface InterfaceDemo {
	void run();
	void sing();
	void play();
	

}
class Person implements InterfaceDemo{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("running..");
		
	}

	@Override
	public void sing() {
		// TODO Auto-generated method stub
		System.out.println("Singing..");
		
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("playing....");
		
	}
	
}

	
 


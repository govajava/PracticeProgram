package com.practice.programes;

 class Mobile{
	 
	 
	 // NOTE : this comments are written by me  for better understanding  whenever i see code second time
		//                     don't think this it is copy paste.
	 
	 
	String name;
	int price;
	static String colour;
	public void show() {
		System.out.println(name +":"+price +":"+colour);
	}

}

public class StaticVariable {
	public  static void main(String[] args) {
		Mobile m1= new Mobile();
		m1.colour="black";
		m1.price=20000;
		m1.name="samsung";
		
		
		Mobile m2= new Mobile();
		m2.colour="white";
		m2.price=20000;
		m2.name="realme";
		
		m1.colour="gold"; //this change refleced to both mobile objects that is purpose of static block.
		m1.show();
		m2.show();
		
		
		
		
		
		
		
	

	}
	

	
	
}

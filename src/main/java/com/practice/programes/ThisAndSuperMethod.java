package com.practice.programes;

//  Super :- call the constructor of super class that means parent class.
//  this :- this will excicute the constructor of the same class
// Every class in java extend object class  even if you don't mention.

// Every constructor in java has a method  it is there even if you don't mention that method is super(); 
//  even if you don'n mention it is there by default. by default the first statement of every constructor is super.


class A{
	
	public A() {
		super();
		
		System.out.println("A- constructor");
	}
	
	public A(int a) {
		this();
		System.out.println("A parametrised constructor");
	}
	
}
class B extends A{
	
	public B() {
		super();
		System.out.println("B-constructor");
	}
	public B(int b) {
		this();
		System.out.println("b parametrised constructor");
	}
}

public class ThisAndSuperMethod {

	public static void main(String[] args) {
		B obj= new B(5);
		
		

	}
	

}

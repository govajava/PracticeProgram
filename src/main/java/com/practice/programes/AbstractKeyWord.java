package com.practice.programes;


// Abstract key word is used to methods and class as well 
// if you make class as a abstract at least contain one abstract method.
// abstract method does not have any body.

abstract class Vehical{
	public void colourOfVehical() {
		System.out.println("blue");
	}
	 abstract public void carName();
}
class Car extends Vehical{

	@Override
	public void carName() {
		System.out.println("ford");
		
	}
	
}

public class AbstractKeyWord {

	public static void main(String[] args) {
		// here one more important point with the abstract class we can't create object but we can able to create reference.
         Vehical car= new Car() ;
         car.carName();
         car.colourOfVehical();
        	
         
	}

}

package com.practice.programes;

//we can provide the implementation to the abstract method only once we go for both anonymous inner class and abstract.
abstract class Song{
	abstract public void sing();
}
public class AbstractAndAnonymousInnerClass {

	public static void main(String[] args) {
		Song s= new Song() {
		
			public void sing() {
				System.out.println("singing....");
				
			}
		};
		s.sing();

	}

}

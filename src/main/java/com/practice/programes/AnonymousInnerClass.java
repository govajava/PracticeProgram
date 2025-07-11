package com.practice.programes;
//By using anonymous inner class we can change the implementation inside the object with no class name and no class keyword

class Kid{
	public void play() {
		System.out.println("Student playing");
	}
}

public class AnonymousInnerClass {

	public static void main(String[] args) {
		Kid kid= new Kid() {
			//this is anonymous inner class is it has no class name and no class keyword.
			public void play() {
				System.out.println("two students are playing");
			}
		};
		kid.play();

	}

}

package com.practice.programes;

//Inner class is class inside the class.
class OuterClass{
	public void show() {
		System.out.println("showed");
	}
	// we can use static only for inner class it is not applicable for outer classes.Static key is for global level access
	static class InnerClass{
		public void play() {
			System.out.println("playing");
		}
	}
}

public class InnerClass {

	public static void main(String[] args) {
		OuterClass oc= new OuterClass();
		oc.show();
		//we cannot create a object for innerclass directly by through the outer class we can create the object of inner class
		OuterClass.InnerClass ic= new OuterClass.InnerClass();
		ic.play();

	}

}

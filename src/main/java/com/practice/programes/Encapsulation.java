package com.practice.programes;

public class Encapsulation {
	
	//NOTE : this comments are written by me  for better understanding  whenever i see code second time
	//                     don't think this it is copy paste.
	
	  // Encapsulation :- Binding the data with methods,only way to access the methods with
	  //  the help these methods is known as encapluation.
	public static void main(String[] args) {
		
	
	class Human{
		private int age;
		private String name;
		
		public int getAge() {
			return age;
		}
		public void setAge(int a) {
			age= a;
		}
		public String getName() {
			return name;
		}
		public void setName(String n) {
			name=n;
		}
	}


	Human obj= new Human();
	 obj.setName("Govardhan");
	 obj.setAge(22);
	 System.out.println(obj.getName()+":"+obj.getAge());
		 	 
		 

	}
}



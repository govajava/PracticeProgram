package com.practice.programes;

public class ThisKeyword {
	public static void main(String[] args) {
		//NOTE : this comments are written by me  for better understanding  whenever i see code second time
	    //    don't think this it is copy paste.
		
		// this Keyword :-this is a keyworg that represent current object that means object which is called by method.
		
		
		class Human{
			private int age;
			private String name;
			
			public int getAge() {
				return age;
			}
			public void setAge(int age) {
				age= age;
			}
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name=name;
			}
		}


		Human obj= new Human();
		 obj.setName("Govardhan");
		 obj.setAge(22);
		 System.out.println(obj.getName()+":"+obj.getAge());
			 	 
			 

		}
}

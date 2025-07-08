package com.practice.programes;

public class DefaultConstructor {
	public static void main(String[] args) {
		//NOTE : this comments are written by me  for better understanding  whenever i see code second time
	    //    don't think this it is copy paste.
		
		// Constructor is a special method and it has the same name as the class name and it never expect return type
		// like int,float,double...etc whenever we create a new object Constuctor will created. and we simply menction that
		// with a  access like public and menction the class name as constructor name. we use constructon to asign the default values.
		
		
		
		class Human{
			private int age;
			private String name;
			
			//Constructor
			public Human() {
				age=20;
				name="govardhan";
			}
			
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
		
		 System.out.println(obj.getName()+":"+obj.getAge());
			 	 
			 

		}

}

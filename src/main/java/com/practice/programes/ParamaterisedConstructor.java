package com.practice.programes;

public class ParamaterisedConstructor {
	public static void main(String[] args) {
		//NOTE : this comments are written by me  for better understanding  whenever i see code second time
	    //    don't think this it is copy paste.
		
	
		class Human{
			private int age;
			private String name;
			
			//ParamaterisedConstructor
			public Human(String name,int age) {
				this.age=age;
				this.name=name;
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


		Human obj= new Human("govardhn", 22);
		
		 System.out.println(obj.getName()+":"+obj.getAge());
			 	 
			 

		}

}

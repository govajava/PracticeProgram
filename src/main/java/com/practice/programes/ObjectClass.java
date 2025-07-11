package com.practice.programes;
class Student{
	int age;
	String name;
}

public class ObjectClass {

	public static void main(String[] args) {
		Student s= new Student();
		s.name= "govardhan";
		s.age=23;
		System.out.println(s);
// here the output is some hashcode  because by defaultly object calls toString method,toString method is not there in the Student classs rigth hoew it will cal means by defaultly Object class is the super class for every java class in Object  classs  the method toString is there. 
	}

}

package com.practice.programes;

public class MethodOverloading {

	public static void main(String[] args) {
		//NOTE : this comments are written by me  for better understanding  whenever i see code second time
		//                     don't think this it is copy paste.
		
		
		// MethodOverloading means we will have same method name but the different arguments,
		// it is happen with in the class
		
		System.out.println(MethodOverloading.add(2, 3));
		
		

	}
		public static  int add(int a,int b) {
			return a+b;
		}
		public  static int add(int a, int b, int c) {
			return a+b+c;
		}

}

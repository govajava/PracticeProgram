package com.practice.programes;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a = 10;
      int b = 20;
      System.out.println("Before swaping:"+ "a:"+a+","+"b:"+b);

      a = a+b;
      b = a-b;
      a = a-b;
      System.out.println("After swaping:"+ "a:"+a+","+"b:"+b);
	}

}

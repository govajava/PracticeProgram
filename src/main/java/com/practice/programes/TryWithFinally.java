package com.practice.programes;

//finally block is using to closing the resources.

public class TryWithFinally {

	public static void main(String[] args) {
		int i=0;
		int j=0;
		
		
		try
		{
			
			j=15/i;
			if(j==0)throw new ArithmeticException();
			
		} catch(ArithmeticException e) {
			System.out.println("can't divided by zero");
		
		}catch(Exception e) {
			System.out.println("Something went wrong"+e);
		}
		
		finally {
			System.out.println("byee");
		}

	}

}

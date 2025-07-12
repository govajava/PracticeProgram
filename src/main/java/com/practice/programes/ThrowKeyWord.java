package com.practice.programes;
// throw keyword is used to throw a new exception.
public class ThrowKeyWord {

	public static void main(String[] args) {
		int i=0;
		int j=0;
		
		
		try
		{
			
			j=15/i;
			if(j==0)throw new ArithmeticException();
			
		} catch(ArithmeticException e) {
			System.out.println("can't divided by zero");
		}catch(NullPointerException e) {
			System.out.println(" string cant be null ");
		}catch(Exception e) {
			System.out.println("Something went wrong"+e);
		}

	}

	}



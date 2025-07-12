package com.practice.programes;
// we ca use try with multiple catches but one order is important  we can declear the  exception from child to parent.

public class TryWithMuitipleCatches {

	public static void main(String[] args) {
		int i=0;
		int j=0;
		String str= null;
		int num[]=new int[5];
		
		try
		{
			
			j=15/i;
			System.out.println(str.length());
			System.out.println(num[5]);
			
		} catch(ArithmeticException e) {
			System.out.println("can't divided by zero");
		}catch(NullPointerException e) {
			System.out.println(" string cant be null ");
		}catch(Exception e) {
			System.out.println("Something went wrong"+e);
		}

	}

}

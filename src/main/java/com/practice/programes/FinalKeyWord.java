package com.practice.programes;

public class FinalKeyWord {
	
	// if you make the class as final you can't extend the class.
	public static void main(String[] args) {
		

		  class Calculator{
		public int add(int a, int b) {
			return a+b;
		}
		public int sub(int a, int b) {
			return a-b;
		}
		
		 }
		
	 class AdvanceCalculator extends Calculator{
		public int mul(int a, int b) {
			return a*b;
		}
		public int div(int a, int b) {
			return a/b;
		}
					
	}

	  

		 
			AdvanceCalculator ac= new AdvanceCalculator();
			int add= ac.add(2, 3);
			System.out.println(add);
		}

}

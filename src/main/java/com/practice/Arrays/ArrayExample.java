package com.practice.Arrays;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=3;
		if(a<10&&a>6)
			System.out.println("hello");
		else
			System.out.println("Byee");

		
		
		
		//Arrays : Multiple values can store in only one variable is Array.
		int arr[]= {1,2,3,4,5};
		
		
		//if u know the size in advance.
		 int arr1[]= new int[4];
		 arr1[0]=1;
		 arr1[1]=2;
		 arr1[2]=4;
		 arr1[3]=4;
		 
		 
		 //to get only one value from array
		 System.out.println(arr[3]);
		 
		 
		 //to get whole array
		 for(int i=0;i<=3;i++) {
			 System.out.println(arr[i]);
		 }
		 
		 
		 // Enhanced For loop(instead of above for loop we use Enhanced For loop)
		 for(int n:arr1) {
			 System.out.println(n);
		 }
		 
		 

	}

}

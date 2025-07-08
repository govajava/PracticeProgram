package com.practice.programes;

public class StringBufferStringBuilder {

	public static void main(String[] args) {
		
		
	//  NOTE : this comments are written by me  for better understanding  whenever i see code second time
			//                     don't think this it is copy paste.
	
		
		//StringBuffer & StringBuilder are mutable.  StringBuffer is thread safe and StringBuilder is not ThreadSafe.
		String str="Govardhan";
		StringBuffer sb=  new StringBuffer(str);
		sb.append(" reddy");
		sb.insert(0, "Java  ");
		System.out.println(sb);

	}

}

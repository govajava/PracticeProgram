package com.practice.programes;

public class OverRiding {
	
	// OverRiding :- OverRiding means same method name and same arguments but implementation is different it is happened out side the class.

	public static void main(String[] args) {
	


class Calc{
	public int add(int a,int b) {
		return a+b;
	}
}
class AdvanceCalc extends Calc{
	public int add(int a,int b) {
		return a+b+1;
	
}
}
    

AdvanceCalc ac= new AdvanceCalc();
    int add= ac.add(1, 2);
    System.out.println();


}
}

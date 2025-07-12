package com.practice.programes;
// LambdaExpression is Anonymous that means it has no methodName and no return type no access specifier it is just with a lambda symbol.And it will work only with a Functional interface.

interface Calc{
	int add(int a,int b);
}

public class LambdaExpressions {

	public static void main(String[] args) {
		Calc c= (a,b)-> a+b;
          int result =c.add(2, 5);
          System.out.println(result);
	}

}

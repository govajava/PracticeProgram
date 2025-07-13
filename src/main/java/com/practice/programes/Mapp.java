package com.practice.programes;
// Map is used to store a key value pairs.

import java.util.HashMap;
import java.util.Map;

public class Mapp {

	public static void main(String[] args) {
		  Map<String,Integer> students= new HashMap<>();
		  students.put("govardhan", 22);
		  students.put("loki", 25);
		  students.put("shalu", 25);
		  students.put("govardhan", 25);
		  System.out.println(students);

	}

}

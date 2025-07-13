package com.practice.programes;
// Methos reference is pass the method name inside the method by specifing this method is responseble to de the work for you.

import java.util.Arrays;
import java.util.List;

public class MethodReference {

	public static void main(String[] args) {
		List<String> nums=  Arrays.asList("Loki","Shalu","Gova");
		List<String> uName= nums.stream().map(String::toUpperCase).toList();
		uName.forEach(System.out::println);
		
		}
	}



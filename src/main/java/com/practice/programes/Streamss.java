package com.practice.programes;
// Streams are the one of the main concept in java8 Stream makes your work easy by having this functions like map,flatmap,sort....etc  and it provide methods like .nd we can't use the stream twice.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streamss {

	public static void main(String[] args) {
		List<Integer> nums=  Arrays.asList(1,2,3,4,5,6);
		for(int s:nums) {
			System.out.println(s);
		}
	  nums.forEach(n->System.out.println(n));
	  List<Integer>even= nums.stream().filter(i->i%2==0).collect(Collectors.toList());
	  System.out.println(even);
	  List<Integer>numsdiv2=nums.stream().map(i->i*2).collect(Collectors.toList());
	  System.out.println(numsdiv2);
	}

}

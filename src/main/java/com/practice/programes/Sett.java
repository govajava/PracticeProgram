package com.practice.programes;
//Set is interface that extends the collection interface and it can't allow the duplicates,it  doesn't maintain the insertion order, if we want sorted order we can replace tree set in place of hashset class By using set we can't get the element by index. 

import java.util.HashSet;
import java.util.Set;

public class Sett {

	public static void main(String[] args) {
		Set<Integer> nums = new HashSet<>();
		nums.add(2);
		nums.add(3);
		nums.add(4);
		nums.add(2);
		System.out.println(nums);
	}

}

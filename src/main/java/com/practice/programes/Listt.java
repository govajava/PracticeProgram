package com.practice.programes;
//List is interface that extends the collection interface and it can allow the duplicates,it maintain the insertion order By using list we can get the element by index. 

import java.util.ArrayList;
import java.util.List;

public class Listt {

	public static void main(String[] args) {
		List<Integer> nums= new ArrayList<>();
		nums.add(1);
		nums.add(4);
		nums.add(3);
		nums.add(5);
		System.out.println(nums);

	}

}

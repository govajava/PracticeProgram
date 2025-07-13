package com.practice.programes;
//Optional class is used to avoide the null pointer exception.

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalCls {

	public static void main(String[] args) {
		List<String> names=Arrays.asList("Loki","Shalu","Gova");
		Optional<String> str= names.stream().filter(i->i.contains("n")).findFirst();
		System.out.println(str.orElse("not found"));

	}

}

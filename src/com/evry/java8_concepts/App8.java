package com.evry.java8_concepts;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App8 {
   
	public static void main(String[] args) {
		
		List<Integer> myList = new ArrayList<>();
		for(int i=0; i<100; i++) {
			myList.add(i);
		}
		myList.stream().forEach(System.out::println);
		System.out.println(myList.stream().filter(num -> num <= 20).collect(Collectors.toList()));
	}
}

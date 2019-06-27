package com.evry.java8_concepts;

import java.util.stream.Stream;

public class App5 {
   
	public static void main(String[] args) {
	      Stream.iterate(1, count -> count+1)
	      .filter(number -> number%3==0)
	      .limit(6)
	      .forEach(System.out::println);
	}
}

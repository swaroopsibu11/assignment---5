package com.evry.java8_concepts;

import java.util.function.Predicate;

public class Example2_Lambda {
	public static void main(String[] args) {
       
		Predicate<Integer>  greaterThanTen = (i) -> i > 10;
		Predicate<Integer>  lowerThanTwenty = (i) -> i < 20;
		
		boolean result = greaterThanTen.and(lowerThanTwenty).test(15);
		System.out.println(result);
	}
}

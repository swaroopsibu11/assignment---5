package com.evry.java8_concepts;

import java.util.Arrays;

public class App22 {

	public static void main(String[] args) {
		
		int num[] = {9,8,7,6,3,1};
		//System.out.println("Before sorted: ");
		//Arrays.stream(num).forEach(x->System.out.println(x));
		//System.out.println("After sorted: ");
		Arrays.stream(num).sorted().forEach(System.out::println);
		Arrays.parallelSort(num);
		Arrays.stream(num).sorted().forEach(System.out::println);
		//Arrays.stream(num).forEach(z->System.out.println(z));
	}
}

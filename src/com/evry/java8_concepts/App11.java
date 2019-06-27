package com.evry.java8_concepts;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App11 {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("a", "b", "c", "d", "e");
		System.out.println(names.stream().map(String::toUpperCase).collect(Collectors.toList()));

		List<Integer> numbers = Arrays.asList(2, 7, 3, 5);
		System.out.println(numbers.stream().map(n -> n * n).collect(Collectors.toList()));
		numbers.stream().forEach(System.out::println);
		//numbers.stream().forEach(z->System.out.println(z));
		System.out.println(numbers.stream().sorted().collect(Collectors.toList()));
		System.out.println(numbers.stream().map(n->n*n).sorted().collect(Collectors.toList()));

	}
}

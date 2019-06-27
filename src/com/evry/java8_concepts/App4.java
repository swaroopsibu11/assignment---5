package com.evry.java8_concepts;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class App4 {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(2, 3, 4, 5);
		List<Integer> square = numbers.stream().map(x -> x * x).collect(Collectors.toList());
		System.out.println(square);

		List<String> names = Arrays.asList("Reflection", "Collection", "Stream");

		List<String> result = names.stream().filter(s -> s.startsWith("S")).collect(Collectors.toList());
		System.out.println(result);

		List<String> show = names.stream().sorted().collect(Collectors.toList());
		System.out.println(show);

		List<Integer> num = Arrays.asList(2, 6, 9, 8);

		Set<Integer> squares = num.stream().map(y -> y * y).collect(Collectors.toSet());
		System.out.println(squares);

		System.out.println(num.stream().sorted().collect(Collectors.toSet()));

		num.stream().forEach(z -> System.out.println(z));
		// num.stream().forEach(System.out::println);
		int even = num.stream().filter(x -> x % 2 == 0).reduce(0, (answer, i) -> answer + i);
		System.out.println(even);

	}
}

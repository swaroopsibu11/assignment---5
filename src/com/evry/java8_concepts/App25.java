package com.evry.java8_concepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App25 {

	public static void main(String[] args) {

		List<Integer> l = Arrays.asList(10, 7, 9, 1, 2, 6, 3);
		System.out.println(l.stream().sorted().collect(Collectors.toList()));
		System.out.println(l.stream().sorted((a, b) -> -a.compareTo(b)).collect(Collectors.toList()));
		l.stream().filter(n -> n <= 6).forEach(System.out::println);
		System.out.println(l.stream().filter(n -> n <= 6).count());
		System.out.println(l.stream().filter(n -> n % 2 == 0).findAny());
		System.out.println(l.stream().filter(n -> n % 3 == 0).findFirst());
		l.stream().sorted((a, b) -> a.compareTo(b)).forEach(z -> System.out.println(z));
		System.out.println(l.stream().sorted((a, b) -> a.compareTo(b)).collect(Collectors.toList()));

	}
}

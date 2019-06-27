package com.evry.java8_concepts;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App13 {

	public static void main(String[] args) {

		Stream<String> language = Stream.of("java", "python", null, "ruby", null);
		List<String> lists = language.collect(Collectors.toList());
		lists.forEach(System.out::println);
		// lists.stream().forEach(System.out::println);
		System.out.println(lists.stream().filter(x -> x != null).collect(Collectors.toList()));
	}
}

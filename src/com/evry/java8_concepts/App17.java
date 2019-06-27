package com.evry.java8_concepts;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App17 {

	public static void main(String[] args) {

		List<String> StringCollection = new ArrayList<String>();
		StringCollection.add("ddd2");
		StringCollection.add("aaa2");
		StringCollection.add("bb1");
		StringCollection.add("aaa1");
		StringCollection.add("bbb3");
		StringCollection.add("ccc");
		StringCollection.add("bbb2");
		StringCollection.add("ddd1");

		StringCollection.stream().filter(s -> s.startsWith("a")).forEach(System.out::println);

		StringCollection.stream().sorted().filter(s -> s.startsWith("a")).forEach(System.out::println);

		StringCollection.stream().sorted().collect(Collectors.toList()).forEach(z -> System.out.println(z));

		StringCollection.stream().map(String::toUpperCase).sorted((a, b) -> -a.compareTo(b))
				.forEach(System.out::println);

		StringCollection.stream().filter(s -> s.startsWith("a")).sorted((a, b) -> b.compareTo(a))
				.forEach(System.out::println);

		boolean result = StringCollection.stream().allMatch(a -> a.startsWith("a"));
		System.out.println(result);

		System.out.println(StringCollection.stream().anyMatch(a -> a.startsWith("a")));

		System.out.println(StringCollection.stream().noneMatch(a -> a.startsWith(a)));

		System.out.println(StringCollection.stream().filter(s -> s.startsWith("b")).count());

	}
}

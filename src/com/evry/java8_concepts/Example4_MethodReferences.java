package com.evry.java8_concepts;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import javax.xml.crypto.dsig.Transform;

import org.omg.Messaging.SyncScopeHelper;

public class Example4_MethodReferences {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("shekhar", "rahul", "sameer");
		System.out.println(names.stream().sorted().collect(Collectors.toList()));
		names.stream().forEach(z -> System.out.println(z));
		//names.forEach(System.out::println);
		//names.stream().forEach(System.out::println);
		System.out.println(names.stream().filter(str -> str.length() < 6).count());
		System.out.println(names.stream().filter(s -> s.startsWith("s")).collect(Collectors.toList()));

	}
}

package com.evry.java8_concepts;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Example3_FunctionalInterfaces {

	public static void main(String[] args) {

		Predicate<String> nameStartWithS = name -> name.startsWith("s");

		Consumer<String> sendEmail = message -> System.out.println("sending email >>" + message);

		Function<String, Integer> StringToLength = name -> name.length();

		boolean result = nameStartWithS.test("set");

		System.out.println(result);

	}
}

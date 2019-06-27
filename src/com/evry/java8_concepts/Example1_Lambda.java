package com.evry.java8_concepts;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Example1_Lambda {
	public static void main(String[] args) {

		List<String> names = Arrays.asList("shekhar", "rahul", "sameer");
		Collections.sort(names);
		System.out.println("names sorted alphabaticaly >>");
		System.out.println(names);
		System.out.println();

		Collections.sort(names, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return s1.length() - s2.length();
			}

		});

		//Collections.sort(names, (String s3, String s4) -> s3.length() - s4.length());
		System.out.println("names sorted by length >>");
		System.out.println(names);
		System.out.println();

		Collections.sort(names, (String s1, String s2) -> s2.length() - s1.length());
		System.out.println("names sorted by length in reversed >>");
		System.out.println(names);
		System.out.println();

	}
}
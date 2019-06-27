package com.evry.java8_concepts;

import java.util.Arrays;

public class App23 {

	public static void main(String[] args) {
		String s = "PACDRG";
		char[] c = s.toCharArray();
		System.out.println("Before unsorted: ");
		for (char t : c) {
			System.out.println(t);
		}
		Arrays.sort(c);
		System.out.println("After sorted: ");
		for (char r : c) {
			System.out.println(r);
		}

	}
}

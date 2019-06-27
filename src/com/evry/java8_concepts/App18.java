package com.evry.java8_concepts;

import java.util.Comparator;
import java.util.TreeSet;

public class App18 {

	public static void main(String[] args) {
		
		TreeSet t = new TreeSet<>(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return -o1.compareTo(o2);
			}
		});
		t.add("A");
		t.add("Z");
		t.add("K");
		t.add("B");
		t.add("a");
		System.out.println(t);
		
	}
}

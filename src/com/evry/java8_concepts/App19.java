package com.evry.java8_concepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class App19 {

	public static void main(String[] args) {

		HashMap<Integer, String> m = new HashMap<Integer, String>();
		m.put(5, "A");
		m.put(11, "C");
		m.put(4, "Z");
		m.put(77, "Y");
		m.put(9, "P");
		m.put(66, "Q");
		m.put(0, "R");
		System.out.println(m);

		System.out.println(m.entrySet().stream().sorted(Map.Entry.comparingByKey()).collect(Collectors
				.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldvalue, newvalue) -> oldvalue, LinkedHashMap::new)));

		System.out.println(m.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors
				.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldvalue, newvalue) -> oldvalue, LinkedHashMap::new)));

		Set<Entry<Integer, String>> s = m.entrySet();
		List<Entry<Integer, String>> l = new ArrayList<Entry<Integer, String>>(s);
		Collections.sort(l, new Comparator<Entry<Integer, String>>() {

			@Override
			public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
				return -o1.getValue().compareTo(o2.getValue());
			}
		});

		for (Entry<Integer, String> e : l) {
			System.out.println(e.getValue());
		}
	}
}

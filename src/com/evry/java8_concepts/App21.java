package com.evry.java8_concepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class App21 {

	public static void main(String[] args) {

		TreeMap<Integer, String> t = new TreeMap<Integer, String>();
		t.put(100, "ZZZ");
		t.put(103, "YYY");
		t.put(101, "XXX");
		t.put(104, "PPP");
		System.out.println(t);

		System.out.println(t.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors
				.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldvalue, newvalue) -> oldvalue, LinkedHashMap::new)));

		Set<Entry<Integer, String>> s = t.entrySet();
		List<Entry<Integer, String>> l = new ArrayList<Entry<Integer, String>>(s);
		Collections.sort(l, new Comparator<Entry<Integer, String>>() {

			@Override
			public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
				return -o1.getValue().compareTo(o2.getValue());
			}
		});
		for (Entry e : l) {
			System.out.println(e.getValue());
		}

	}
}

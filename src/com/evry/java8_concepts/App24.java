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

public class App24 {

	public static void main(String[] args) {

		HashMap<String, String> m = new HashMap<String, String>();
		m.put("JDK 1.1.4", "Sparkler");
		m.put("J2SE 1.1.2", "Playground");
		m.put("J2SE 1.3", "Kestrel");
		m.put("J2SE 1.4", "Merlin");
		m.put("J2SE 5.0", "Tiger");
		m.put("JAVA SE 6", "Mustang");
		m.put("JAVA SE 7", "Dolphin");

		System.out.println(m);

		/*
		 * System.out.println(m.entrySet().stream().sorted(Map.Entry.comparingByKey()).
		 * collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
		 * (oldvalue,newvalue)->oldvalue,LinkedHashMap::new)));
		 * 
		 * System.out.println(m.entrySet().stream().sorted(Map.Entry.comparingByValue())
		 * .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
		 * (oldvalue,newvalue)->oldvalue,LinkedHashMap::new)));
		 */
		Set s = m.entrySet();
		List<Map.Entry<String, String>> l = new ArrayList<Map.Entry<String, String>>(s);
		Collections.sort(l, new Comparator<Map.Entry<String, String>>() {

			@Override
			public int compare(Entry<String, String> o1, Entry<String, String> o2) {

				return o1.getKey().compareTo(o2.getKey());
			}
		});

		for (Entry<String, String> e : l) {
			System.out.println(e);

		}

	}
}

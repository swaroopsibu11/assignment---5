package com.evry.java8_concepts;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class App14 {

	public static void main(String[] args) {

		Map<String, Integer> m = new HashMap<String, Integer>();
		m.put("A", 5);
		m.put("D", 1);
		m.put("B", 4); 
		m.put("F", 2);
		m.put("C", 3);
		System.out.println(m);
		
		//Map<String,Integer> m1 = new TreeMap<String,Integer>(m);
		//System.out.println(m1);
		
	    Map<String,Integer> result = m.entrySet().stream()
	    		.sorted(Map.Entry.comparingByKey()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
	    				(oldValue,newValue) -> oldValue, LinkedHashMap::new));
	    System.out.println(result);
	    
	    Map<String,Integer> result1 = m.entrySet().stream()
	    		.sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
	    				(oldValue,newValue) -> oldValue, LinkedHashMap::new));
	    
	    System.out.println(result1);
		
		//Set<Entry<String, Integer>> s = m.entrySet();
		//List<Entry<String, Integer>> l = new ArrayList<Entry<String, Integer>>(s);
		
		
		//Set<String> set = m.keySet();
		//Collection<Integer> list = m.values();
	    
	   

		

	}
}

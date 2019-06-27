package com.evry.java8_concepts;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import javax.activation.MailcapCommandMap;

public class App7 {
   
	public static void main(String[] args) {
		
		Map<Integer,String> m = new HashMap<Integer,String>();
		m.put(11, "ABC");
		m.put(22, "DEF");
		m.put(33, "GHI");
		m.put(44, "JKL");
		
		Map<Integer,String> result = m.entrySet().stream()
				                     .filter(map -> map.getKey() <=22)
				                .collect(Collectors.toMap(hmap -> hmap.getKey(), hmap -> hmap.getValue()));
		
		System.out.println("Result : " + result);
	}
}

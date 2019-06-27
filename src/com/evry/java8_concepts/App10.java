package com.evry.java8_concepts;

import java.util.Arrays;
import java.util.List;

class Person {

	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

}

public class App10 {

	public static void main(String[] args) {

		List<Person> persons = Arrays.asList(new Person("Chris", 55), new Person("David", 45), new Person("James", 25));
		Person result = persons.stream().filter(p -> "Chris".equals(p.getName())).findAny().orElse(null);
		System.out.println(result);
		
	}
}

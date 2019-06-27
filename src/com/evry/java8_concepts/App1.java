package com.evry.java8_concepts;

public class App1 implements A {
	@Override
	public void doSth() {
		System.out.println("indide App1");
	}

	public static void main(String[] args) {

		new App1().doSth();

	}
}

interface A {

	default void doSth() {
		System.out.println("indide A");
	}
}

package com.evry.java8_concepts;

public class App2 implements B, D {
	public static void main(String[] args) {
      
		new App2().doSth();
		
	}
}

interface B {

	default void doSth() {

		System.out.println("inside B");
	}
}

interface D extends B  {

	default void doSth() {
       //B.super.doSth();
		System.out.println("inside D");
	}
}

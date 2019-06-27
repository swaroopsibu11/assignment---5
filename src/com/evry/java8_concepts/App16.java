package com.evry.java8_concepts;

import java.util.ArrayList;
import java.util.List;

class Hosting {

	private int id;
	private String name;
	private long websites;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getWebsites() {
		return websites;
	}

	public void setWebsites(long websites) {

	}

	public Hosting() {
		super();
	}

	public Hosting(int id, String name, long websites) {
		super();
		this.id = id;
		this.name = name;
		this.websites = websites;
	}

	@Override
	public String toString() {
		return "Hosting [id=" + id + ", name=" + name + ", websites=" + websites + "]";
	}

}

public class App16 {

	public static void main(String[] args) {
        
		List<Hosting> list = new ArrayList<>();
		    list.add(new Hosting(1, ".com", 80000));
	        list.add(new Hosting(2, "google.com", 90000));
	        list.add(new Hosting(3, ".com", 120000));
	        list.add(new Hosting(4, "aws.amazon.com", 200000));
	        list.add(new Hosting(5, ".com", 1));
	      

	}
}

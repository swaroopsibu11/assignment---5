package com.evry.java8_concepts;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Studentt {

	private int id;
	private String name;
	private String country;

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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Studentt() {

	}

	public Studentt(int id, String name, String country) {
		super();
		this.id = id;
		this.name = name;
		this.country = country;
	}

	@Override
	public String toString() {
		return "Studentt [id=" + id + ", name=" + name + ", country=" + country + "]";
	}

}

public class App20 {

	public static void main(String[] args) {

		List<Studentt> l = Arrays.asList(new Studentt(102, "Parth", "India"), new Studentt(60, "Sudhakar", "Australia"),
				new Studentt(110, "Sadiq", "Canada"), new Studentt(55, "Ramakrishna", "New-zeland"),
				new Studentt(115, "Srikumar", "US"));

		Collections.sort(l, new Comparator<Studentt>() {

			@Override
			public int compare(Studentt o1, Studentt o2) {
				Integer id1 = (int) o1.getId();
				Integer id2 = (int) o2.getId();
				return id1.compareTo(id2);
			}
		});
		System.out.println(l);

		Collections.sort(l, new Comparator<Studentt>() {

			@Override
			public int compare(Studentt o1, Studentt o2) {
				String name1 = (String) o1.getName();
				String name2 = (String) o2.getName();
				return -name1.compareTo(name2);
			}
		});
        System.out.println(l);
        
        Collections.sort(l, new Comparator<Studentt>() {

			@Override
			public int compare(Studentt o1, Studentt o2) {
				String country1 = (String) o1.getCountry();
				String country2 = (String) o2.getCountry();
				return country1.compareTo(country2);
			}
		});
        System.out.println(l);
	}
}

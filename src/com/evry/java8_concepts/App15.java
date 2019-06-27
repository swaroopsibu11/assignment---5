package com.evry.java8_concepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee {

	private String id;
	private String name;
	private int salary;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Employee() {

		super();
	}

	public Employee(String id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}

public class App15 {
    
	public static void main(String[] args) {
		
		List<Employee> employees = Arrays.asList(new Employee("1020", "Chris", 200000),
				                                 new Employee("1004", "Daniel", 100000),
				                                 new Employee("1001", "Wokes", 95000),
				                                 new Employee("1010", "Ranjish", 134000),
				                                 new Employee("1003", "Steph", 135000));
		
		System.out.println(employees);
		
		
		Collections.sort(employees, Comparator.comparing(Employee::getId));
		System.out.println("Sorted by employee id :" + employees);
		
		Collections.sort(employees, Comparator.comparing(Employee::getId).reversed());
		System.out.println("Sorted by employee id in dsc :" + employees);
		
		Collections.sort(employees, Comparator.comparing(Employee::getName));
		System.out.println("Sorted by employee name :" + employees);
		
		Collections.sort(employees, Comparator.comparing(Employee::getName).reversed());
		System.out.println("Sorted by employee name in dsc :" + employees);

		Collections.sort(employees, Comparator.comparingInt(Employee::getSalary));
		System.out.println("Sorted by employee salary :" + employees);
		
		Collections.sort(employees, Comparator.comparing(Employee::getSalary).reversed());
		System.out.println("Sorted by employee salary in dsc :" + employees);

		

		
		
	}
}

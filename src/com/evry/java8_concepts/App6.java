package com.evry.java8_concepts;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Student {

	int stuId;
	int stuAge;
	String stuName;

	public Student(int stuId, int stuAge, String stuName) {
		super();
		this.stuId = stuId;
		this.stuAge = stuAge;
		this.stuName = stuName;
	}

	public int getStuId() {
		return stuId;
	}

	public void setStuId(int stuId) {
		this.stuId = stuId;
	}

	public int getStuAge() {
		return stuAge;
	}

	public void setStuAge(int stuAge) {
		this.stuAge = stuAge;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
     
	/*public static List<Student> getStudents(){
		List<Student> list = new ArrayList<>();
		list.add(new Student(11, 28, "Lucky"));
		list.add(new Student(28, 27, "Tim"));
		list.add(new Student(32, 30, "Daniel"));
		list.add(new Student(49, 27, "Steve"));
		return list;
	}*/
}

public class App6 {

	public static void main(String[] args) {
       
		Predicate<Student> p1 = s -> s.stuName.startsWith("A");
		Predicate<Student> p2 = s -> s.stuAge < 40;
		Predicate<Student> p3 = s -> s.stuAge < 40 && s.stuName.startsWith("P");
	 
	     List<Student> list = new ArrayList<>();
	        list.add(new Student(55, 31, "Swaroop"));
			list.add(new Student(11, 28, "Lucky"));
			list.add(new Student(28, 27, "Tim"));
			list.add(new Student(32, 30, "Daniel"));
			list.add(new Student(49, 27, "Steve"));	
		//List<Student> list = Student.getStudents();
		boolean b1 = list.stream().allMatch(p1);
		System.out.println("Starts with A"+b1);
		
		Predicate<Student> p4 = s -> s.stuName == ("Swaroop");
		boolean b2 = list.stream().allMatch(p2);
		System.out.println(b2);
		
		/*if(p4 == true){
			list.stream().forEach(System.out::println);
		}*/
		
		boolean b3 = list.stream().allMatch(p3);
		System.out.println(b3);
	}
}

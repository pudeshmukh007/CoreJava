package com.comparable;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>
{
	private int id;
	private String name;
	private int age;
	
	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		if(age==o.age)
			return 0;
		else if (age>o.age)
			return 1;
		else
			return -1;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	
	
}

public class ComparableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Student> list = Arrays.asList(new Student(10,"pd",27),new Student(5, "param", 25));
		
		Collections.sort(list);
		
		for (Student student : list) {
			
			System.out.println(student.toString());
		}
		

	}

}

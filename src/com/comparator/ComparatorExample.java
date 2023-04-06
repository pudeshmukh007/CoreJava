package com.comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student1
{
	int id;
	String name;
	int age;
	
	public Student1(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	
	
}

class AgeComparartor implements Comparator<Student1>
{

	@Override
	public int compare(Student1 o1, Student1 o2) {
		// TODO Auto-generated method stub
		if(o1.age==o2.age)
			return 0;
		else if(o1.age>o2.age)
			return 1;
		else
			return -1;
	}
	
}

class NameComparartor implements Comparator<Student1>
{

	@Override
	public int compare(Student1 o1, Student1 o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}
	
}

public class ComparatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Student1> list = Arrays.asList(new Student1(10,"pd",27),new Student1(5, "param", 25));
		
		Collections.sort(list,new AgeComparartor());
		
		for (Student1 student : list) {
			
			System.out.println(student);
		}
		
		System.out.println("======================================================================");
		Collections.sort(list,new NameComparartor());
		
		for (Student1 student : list) {
			
			System.out.println(student);
		}
		
		List<Integer> integers = Arrays.asList(10,3,2,9,11,20,1);
		Collections.sort(integers);
		System.out.println(integers);

	}

}

package com.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashcodeAndEqualsMethodContractExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 student = new Student1(1, "pd");
		Student1 student1 = new Student1(2, "pd");
		
		Map<Student1, Integer> map = new HashMap();
		map.put(student1,10);
		map.put(student,20);
		
		System.out.println("object are equals "+student.equals(student));
		System.out.println(student.hashCode());
		System.out.println(student1.hashCode());
		System.out.println(map.size());
	}

}

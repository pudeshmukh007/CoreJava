package com.hashmap;

import java.util.Objects;

public class Student1 {

	private int id;
	private String name;
	
	public Student1(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(id,name);
	}

	
	@Override 
	public boolean equals(Object obj) 
	{ 
		// TODO Auto-generated method stub
		if(this == obj) 
			return true; 
		if(obj == null ||getClass()!=obj.getClass()) 
			return false; 
		Student1 student1 = (Student1)obj;
			return id==student1.id && Objects.equals(name, student1.name); 
	}
	 
	
	
}

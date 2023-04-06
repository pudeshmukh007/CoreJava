package com.clonable;

class Employee2 implements Cloneable
{
	private int id;
	private String name;
	
	public Employee2(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	

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



	@Override
	public String toString() {
		return "Employee2 [id=" + id + ", name=" + name + "]";
	}



	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
}

public class ByDefaultShallowCopyConvertedDeepCopy {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		Employee2 employee2 = new Employee2(10, "pd");
		
		Employee2 employee22 = (Employee2) employee2.clone();
		
		employee22.setName("param");
		
		System.out.println(employee2);
		System.out.println(employee22);

	}

}

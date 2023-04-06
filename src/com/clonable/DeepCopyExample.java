package com.clonable;

class Employee1 implements Cloneable
{
	private int id;
	private String name;
	private Address1 address1;
	
	public Employee1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee1(int id, String name, Address1 address1) {
		super();
		this.id = id;
		this.name = name;
		this.address1 = address1;
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

	public Address1 getAddress() {
		return address1;
	}

	public void setAddress(Address1 address1) {
		this.address1 = address1;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address1 + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Employee1 employee1 = (Employee1) super.clone();
		employee1.setAddress((Address1)address1.clone());
		return employee1;
	}
	
	
}

class Address1 implements Cloneable
{
	private String city;
	private String state;
	
	public Address1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address1(String city, String state) {
		super();
		this.city = city;
		this.state = state;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
}

public class DeepCopyExample {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		Address1 address1 = new Address1("pune","maharashtra");
		Employee1 employee1 = new Employee1(10,"pd",address1);
		
		Employee1 employee12 = (Employee1) employee1.clone();
		
		employee12.getAddress().setCity("mumbai");
		
		System.out.println(employee1);
		System.out.println(employee12);

	}

}

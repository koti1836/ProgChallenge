package com.java.table.q3;

/**
 * Person data
 * @author koti
 *
 */
public class Person {
	private int Id;
	private String name;
	private String phoneNumber;
	private String address;

	// Constructor to create Person object

	public Person(int id, String name, String phoneNumber, String address) {
		Id = id;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}

	// Overriding toString method.
	@Override
	public String toString() {
		return "Person{" + "Id=" + Id + ", name='" + name + '\'' + ", phoneNumber='" + phoneNumber + '\''
				+ ", address='" + address + '\'' + '}';
	}
}

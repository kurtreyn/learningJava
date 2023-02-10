package com.learningJava.oop;

public class Address {
	private String street;
	private String city;
	private String zip;

	public Address(String street, String city, String zip) {
		super();
		this.street = street;
		this.city = city;
		this.zip = zip;
	}

	@Override
	public String toString() {
		return String.format("%s, %s, %s", street, city, zip);
	}

}

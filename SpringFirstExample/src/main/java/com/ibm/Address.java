package com.ibm;

public class Address {

	// fields member-of-class Variables

	private String state;
	private String city;
	private String country;

	public Address(String state, String city, String country) {
		this.state = state;
		this.city = city;
		this.country = country;

	}

	@Override
	public String toString() {
		return " Details of Address [state=" + state + ",city=" + city + ", country=" + country + "]";
	}

}

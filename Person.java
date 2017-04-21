package com.bridgelabz.model;

import java.io.Serializable;
import java.util.Comparator;
import java.util.HashSet;

/**Person class in which we are assigning the values by using getters and setters
 * @author bridgeit
 *
 */
public class Person implements Serializable{
	private String firstName;
	private String lastName;
	private String address;
	private String state;
	private int zip;
	private long phone;

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getAddress() {
		return address;
	}

	public String getState() {
		return state;
	}

	public int getZip() {
		return zip;
	}

	public long getPhone() {
		return phone;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Override
	public String toString() {
		return " [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", state=" + state
				+ ", zip=" + zip + ", phone=" + phone + "]";
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	/**Displaying details of an person
	 * 
	 */
	
	public void display() {
		System.out.println("------------------------ADDRESS BOOK-----------------------");
 
		System.out.println("Person details are :");
		
		System.out.println("\n\t\t\tFirstName is :				 " + firstName);
		System.out.println("\n\t\t\tLastName is  : 		 		 " + lastName);
		System.out.println("\n\t\t\tAddress is   : 				 " + address);
		System.out.println("\n\t\t\tState is     : 				 " + state);
		System.out.println("\n\t\t\tZipcode is   : 				 " + zip);
		System.out.println("\n\t\t\tphone is     : 				 " + phone);
	}

	public static Comparator<Person> personName = new Comparator<Person>() {
		public int compare(Person p1, Person p2) {
			String name1 = p1.getFirstName().toUpperCase();
			String name2 = p2.getFirstName().toUpperCase();
			return name1.compareTo(name2);
		}
	};

	public static Comparator<Person> zipcode = new Comparator<Person>() {
		public int compare(Person p1, Person p2) {
			int zip1 = p1.getZip();
			int zip2 = p2.getZip();
			return zip1 - zip2;

		}
	};

	
}

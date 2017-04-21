package com.bridgelabz.controller;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;

import com.bridgelabz.model.Person;
import com.bridgelabz.service.AddressBook;
import com.bridgelabz.service.Service;
import com.bridgelabz.tester.CheckUniqueness;

/**
 * Address Book Controller implementation class
 * 
 * @author bridgeit
 *
 * @param <linkedList>
 */
public class AddressBookController<linkedList> implements AddressBook {
	Scanner scanner = new Scanner(System.in);
	Person person = new Person();
	//HashSet<Long> hashSet = new HashSet<>();
	//Service service = new Service();
	CheckUniqueness ch=new CheckUniqueness();
	LinkedList<Person> linkedList = new LinkedList<Person>();
	HashMap<String, LinkedList> hashMap = new HashMap<String, LinkedList>();
	String addressBookName;

	public void createAddressBook() {
		System.out.println("\nCreate address book ");
		System.out.println("\n give name to address book ");
		String addressBookName = scanner.next();
		System.out.println("Addres book name is :" + addressBookName);
		deseriazable();
		if (hashMap.containsKey(addressBookName)) {
			System.out.println("\n address book is already exist with same name ,do u want to create another?(yes/no)");
			String ans = scanner.next();
			if (ans.equalsIgnoreCase("yes")) {
				createAddressBook();
			}
		} else {
			hashMap.put(addressBookName, new LinkedList<Person>());
		}
	}

	/*
	 * (non-Javadoc)Adding person details to the address book
	 * 
	 * @see com.bridgelabz.service.AddressBook#addPerson(java.lang.String)
	 */
	public void addPerson(String addressBookName1) {
		deseriazable();
		if (hashMap.containsKey(addressBookName1)) {
			person = new Person();
			// linkedList = new LinkedList<Person>();
			System.out.println("\nEnter first name :");
			String firstName = scanner.next();
			person.setFirstName(firstName);
			System.out.println("\nEnter last name :");
			String lastName = scanner.next();
			person.setLastName(lastName);
			System.out.println("\nEnter address :");
			String address = scanner.next();
			person.setAddress(address);
			System.out.println("\nEnter state name :");
			String state = scanner.next();
			person.setState(state);
			System.out.println("\nEnter zip code :");
			int zip = scanner.nextInt();
			int length1=Integer.toString(zip).length();//to check the length of int 
			if(length1==6){
				person.setZip(zip);
			}
			else{
				System.out.println("Invalid lengh of zip code it must be 6 digits only");
				System.out.println("\nEnter zip code :");
				int zip1 = scanner.nextInt();
				int length=Integer.toString(zip1).length();
				if(length==6){
					person.setZip(zip);
				}
			}
			System.out.println("\nEnter 10 digit phone number :");
			long phone = scanner.nextLong();
			int length2=Long.toString(phone).length();
			if(length2==10){
				if(ch.chechUniqueness(phone)){
                person.setPhone(phone);
			}
				else{
					System.out.println("This phone number is already registered  ");       
				
				
				}
			}
		else{
			System.out.println("Invalid length of phone number it must be 10 digits only");
			System.out.println("\nEnter 10 digit phone number :");
			long phone1 = scanner.nextLong();
			int length3=Long.toString(phone1).length();
			if(length3==10){
				//person.setPhone(phone1);
				if(ch.chechUniqueness(phone))
					person.setPhone(phone1);
			}
		}
		//person.display();

		if (hashMap.get(addressBookName1) == null) {
			hashMap.put(addressBookName1, new LinkedList<Person>());
		}
		hashMap.get(addressBookName1).add(person);

		System.out.println("\n" + hashMap);
/*
		linkedList = hashMap.get(addressBookName1);
		for (int i = 0; i < linkedList.size(); i++) {
			Person p1 = linkedList.get(i);
			System.out.println("person name is :"+p1.getFirstName());
			p1.display();
		}*/
		serializable();
	}
		
		else {
			System.out.println("\n Address book is not in record,u first create address book ");
			createAddressBook();
		}
		
	}

	/*
	 * (non-Javadoc)DEleting person with its deatails from an address list
	 * 
	 * @see com.bridgelabz.service.AddressBook#deletePerson()
	 */
	@Override
	public void deletePerson() {
		System.out.println("\n Enter the name of address book which you want to delete ....");
		String deletename = scanner.next();
		System.out.println("\n Enter the firstname of user which record you want to delete ");
		String first = scanner.next();
		deseriazable();
		LinkedList<Person> linkedList = hashMap.get(deletename);

		if (linkedList != null) {
			for (int i = 0; i < linkedList.size(); i++) {
				Person p1 = linkedList.get(i);
				if (p1.getFirstName().equalsIgnoreCase(first)) {
					linkedList.remove(i);
					System.out.println("Delete Successfulll.......  .");
					System.out.println("\n" + linkedList);
				}
			}

			System.out.println(linkedList.remove(deletename));
		} else {
			System.out.println("no data available");
		}
		for (Person per : linkedList) {
			System.out.println(per);
		}
		System.out.println("\n" + hashMap);
		serializable();
	}

	/*
	 * (non-Javadoc)Updating person deatails which belongs to any address book
	 * 
	 * @see com.bridgelabz.service.AddressBook#updatePerson()
	 */
	@Override
	public void updatePerson() {
		System.out.println("\n Enter the name of address book which you want to update ....");
		String updatename = scanner.next();
		System.out.println("\nEnter first name :");
		String first = scanner.next();
		deseriazable();
		boolean flag = hashMap.containsKey(updatename);
		if (flag) {
			LinkedList<Person> linkedList = hashMap.get(updatename);
			for (int i = 0; i < linkedList.size(); i++) {
				Person p1 = linkedList.get(i);
				if (p1.getFirstName().equalsIgnoreCase(first)) {
					System.out.println("\nU can update now   ");
					System.out.println("\nEnter first name :");
					String firstName = scanner.next();
					person.setFirstName(firstName);
					System.out.println("\nEnter last name :");
					String lastName = scanner.next();
					person.setLastName(lastName);
					System.out.println("\nEnter address :");
					String address = scanner.next();
					person.setAddress(address);
					System.out.println("\nEnter state name :");
					String state = scanner.next();
					person.setState(state);
					System.out.println("\nEnter zip code :");
					int zip = scanner.nextInt();
					int length1 = Integer.toString(zip).length();// to check length of int
					if (length1 == 6) {
						person.setZip(zip);
					} else {
						System.out.println("invalid lengh of zip code it must be 6 digits only");
						System.out.println("\nEnter zip code :");
						int zip1 = scanner.nextInt();
						int length = Integer.toString(zip1).length();
						if (length == 6) {
							person.setZip(zip);
						}
					}
					System.out.println("\nEnter phone number :");
					long phone = scanner.nextLong();
					int length2 = Long.toString(phone).length();
					if (length2 == 10) {
						if(ch.chechUniqueness(phone))
						person.setPhone(phone);
					} else {
						System.out.println("Invalid length of phone number it must be 10 digits only");
						System.out.println("\nEnter 10 digit phone number :");
						long phone1 = scanner.nextLong();
						int length3 = Long.toString(phone1).length();
						if (length3 == 10) {
							if(ch.chechUniqueness(phone1))
							person.setPhone(phone1);
						}
					}
					System.out.println("\nUpdate successfull ....");
					// person.display();
				}
			}
		}
		linkedList = hashMap.get(updatename);
		for (int i = 0; i < linkedList.size(); i++) {
			Person p1 = linkedList.get(i);
			System.out.println("person name is :" + p1.getFirstName());
			p1.display();
		}
		System.out.println("\n" + hashMap);
		serializable();
	}

	/*
	 * (non-Javadoc)sorting an person from linkedlist based on their firstname
	 * 
	 * @see com.bridgelabz.service.AddressBook#sortByName()
	 */
	@Override
	public void sortByName() {
		System.out.println("\n Sort by name ");
		System.out.println("\n Enter the address book which you want to sort ");
		String name = scanner.next();
		deseriazable();
		if (hashMap.containsKey(name)) {
			LinkedList<Person> linkedList = hashMap.get(name);
			Collections.sort(linkedList, Person.personName);
			for (Person per : linkedList) {
				System.out.println(per);
			}
		}
		serializable();
	}

	/*
	 * (non-Javadoc)sorting an person from linkedlist based on their zipcode
	 * 
	 * @see com.bridgelabz.service.AddressBook#sortByZip()
	 */
	@Override
	public void sortByZip() {
		System.out.println("\n Sort by zip ");
		System.out.println("\n Enter the address book which you want to sort ");
		String name = scanner.next();
		deseriazable();
		if (hashMap.containsKey(name)) {
			LinkedList<Person> linkedList = hashMap.get(name);
			Collections.sort(linkedList, Person.zipcode);
			for (Person per : linkedList) {
				System.out.println(per);
			}
		}
		serializable();
	}

	/*
	 * (non-Javadoc)searching person from any address book based on unique phone
	 * number
	 * 
	 * @see com.bridgelabz.service.AddressBook#searchPerson()
	 */
	@Override
	public void searchPerson() {
		System.out.println("\n Enter the phone number of person whose record you want to search  ");
		long searchnumber = scanner.nextLong();
		deseriazable();
		Set<String> keys = hashMap.keySet();
		boolean flag = false;
		for (String key : keys) {
			System.out.println(key);
			LinkedList<Person> linkedList = hashMap.get(key);
			System.out.println(linkedList);
			if (linkedList != null) {
				for (int i = 0; i < linkedList.size(); i++) {
					Person p1 = linkedList.get(i);
					if (p1.getPhone() == searchnumber) {
						System.out.println("\n person found ");
						System.out.println("person name is:" + p1.getFirstName());
						p1.display();
						flag = true;
					}
				}
			}
		}
		if (!flag) {
			System.out.println("u entered invalid phone number ");
		}
		serializable();
	}
	
	public void serializable()
	{
		try{
		FileOutputStream fileOutputStream = new FileOutputStream("/home/bridgeit/JavaPrograms/addressbooknew/serializedfile.ser");
		BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(bufferedOutputStream);
		objectOutputStream.writeObject(hashMap);
		objectOutputStream.flush();
		objectOutputStream.close();
		}
		catch(IOException ex){
			System.out.println(ex);
		}
	}
	
	public HashMap deseriazable()
	{
		try{
		FileInputStream fileInputStream = new FileInputStream("/home/bridgeit/JavaPrograms/addressbooknew/serializedfile.ser");
		BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
		ObjectInputStream objectInputStream = new ObjectInputStream(bufferedInputStream);
		 hashMap = (HashMap<String, LinkedList>) objectInputStream.readObject();
		objectInputStream.close();
		}
		catch(IOException | ClassNotFoundException ex)
		{
			System.out.println(ex);
		}
		return hashMap ;
	}

}

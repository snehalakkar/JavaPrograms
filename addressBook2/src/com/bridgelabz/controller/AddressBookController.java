package com.bridgelabz.controller;

import java.io.IOException;
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

import serializationUtil.SerializationUtil;

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
	 HashMap<String, LinkedList<Person>> newhashMap =new HashMap<String, LinkedList<Person>>();
	String addressBookName;

	/* create address book logic
	 * @see com.bridgelabz.service.AddressBook#createAddressBook()
	 */
	public void createAddressBook() {
		System.out.println("\nCreate address book ");
		System.out.println("\n give name to address book ");
		String addressBookName = scanner.next();
		System.out.println("Addres book name is :" + addressBookName);
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
	 * Adding person details to the address book
	 * param: address book name
	 * @see com.bridgelabz.service.AddressBook#addPerson(java.lang.String)
	 */
	public void addPerson(String addressBookName1) throws ClassNotFoundException, IOException {
		if (hashMap.containsKey(addressBookName1)) {
			person = new Person();
			// linkedList = new LinkedList<Person>();
			 hashMap = (HashMap) SerializationUtil.deserialized("/home/bridgeit/JavaPrograms/addressBook2/file.ser");
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
		System.out.println(hashMap);
		
		//calling serialization and deserialization logic
		SerializationUtil.serialized(hashMap, "/home/bridgeit/JavaPrograms/addressBook2/file.ser");
	            /**
	             * Deserializing the object
	             */
			  newhashMap = (HashMap) SerializationUtil.deserialized("/home/bridgeit/JavaPrograms/addressBook2/file.ser");
	            System.out.println("ser and der data"+newhashMap.toString());
	            Set<String> keys = newhashMap.keySet();
	    		for (String key : keys) {
	    			System.out.println(key);
	    			LinkedList<Person> linkedList = newhashMap.get(key);
	    			System.out.println("data from file :");
	    			if (linkedList != null) {
	    				for (int i = 0; i < linkedList.size(); i++) {
	    					Person p1=linkedList.get(i);
	    					//p1.display();
	    				}
	    			}
	    		}
		

		linkedList =  newhashMap.get(addressBookName1);
		for (int i = 0; i < linkedList.size(); i++) {
			Person p1 = linkedList.get(i);
			System.out.println("person name is :"+p1.getFirstName());
			//p1.display();
		}
	}
		else {
			System.out.println("\n Address book is not in record,u first create address book ");
			createAddressBook();
		}
	}

	/*
	 * Deleting person with its deatails from an address list
	 * 
	 * @see com.bridgelabz.service.AddressBook#deletePerson()
	 */
	@Override
	public void deletePerson() throws ClassNotFoundException, IOException {
		System.out.println("\n Enter the name of address book which you want to delete ....");
		String deletename = scanner.next();
		System.out.println("\n Enter the firstname of user which record you want to delete ");
		String first = scanner.next();
		
		newhashMap = (HashMap) SerializationUtil.deserialized("/home/bridgeit/JavaPrograms/addressBook2/file.ser");
		LinkedList<Person> linkedList = newhashMap.get(deletename);
System.out.println(newhashMap);
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
		System.out.println("\n" + newhashMap);

		SerializationUtil.serialized(newhashMap, "/home/bridgeit/JavaPrograms/addressBook2/file.ser");
	}

	/*
	 * Updating person deatails which belongs to any address book
	 * 
	 * @see com.bridgelabz.service.AddressBook#updatePerson()
	 */
	@Override
	public void updatePerson() throws ClassNotFoundException, IOException {
		hashMap = (HashMap) SerializationUtil.deserialized("/home/bridgeit/JavaPrograms/addressBook2/file.ser");
		System.out.println("\n Enter the name of address book which you want to update ....");
		String updatename = scanner.next();
		System.out.println("\nEnter first name :");
		String first = scanner.next();
		boolean flag = hashMap.containsKey(updatename);
		if (flag) {
		LinkedList<Person> linkedList1 = hashMap.get(updatename);
		 System.out.println(linkedList1);
			for (int i = 0; i < linkedList1.size(); i++) {
				Person p1 = linkedList1.get(i);
				if (p1.getFirstName().equalsIgnoreCase(first)) {
					System.out.println("\nU can update now :");
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
		/*System.out.println(hashMap);
		hashMap.get(updatename).add(person);
		linkedList = hashMap.get(updatename);
		for (int i = 0; i < linkedList.size(); i++) {
			Person p1 = linkedList.get(i);
			System.out.println("person name is :" + p1.getFirstName());
			p1.display();*/
			
			//calling serialization and deserialization logic
			
				SerializationUtil.serialized(hashMap, "/home/bridgeit/JavaPrograms/addressBook2/file.ser");
		            /**
		             * Deserializing the object
		             */
				newhashMap = (HashMap) SerializationUtil.deserialized("/home/bridgeit/JavaPrograms/addressBook2/file.ser");
		            System.out.println("ser and der data"+newhashMap.toString());
		            //LinkedList<Person> linkedList= newhashMap.get(updatename);
		            Set<String> keys = newhashMap.keySet();
		            for (String key : keys) {
		    			System.out.println(key);
		    			LinkedList<Person> linkedList = newhashMap.get(key);
		    			//System.out.println("linkedlist is:"+linkedList);
		    			System.out.println("data from file :");
		    			if (linkedList != null) {
		    				for (int k = 0; k < linkedList.size(); k++) {
		    					Person p2=linkedList.get(k);
		    					//p2.display();
		    				}
		    			}
		    		}
		            
		           /* System.out.println("data from file :");
			           for(int j=0;j<linkedList.size();j++){
			           System.out.println(linkedList.get(j));
			           }*/
		}
		// System.out.println("\n" + hashMap);
	

	/*
	 * sorting an person from linkedlist based on their firstname
	 * 
	 * @see com.bridgelabz.service.AddressBook#sortByName()
	 */
	@Override
	public void sortByName() {
		System.out.println("\n Sort by name ");
		System.out.println("\n Enter the address book which you want to sort ");
		String name = scanner.next();
		if (hashMap.containsKey(name)) {
			LinkedList<Person> linkedList = hashMap.get(name);
			Collections.sort(linkedList, Person.personName);
			for (Person per : linkedList) {
				System.out.println(per);
			}
		}
	}

	/*
	 * sorting an person from linkedlist based on their zipcode
	 * 
	 * @see com.bridgelabz.service.AddressBook#sortByZip()
	 */
	@Override
	public void sortByZip() {
		System.out.println("\n Sort by zip ");
		System.out.println("\n Enter the address book which you want to sort ");
		String name = scanner.next();
		if (hashMap.containsKey(name)) {
			LinkedList<Person> linkedList = hashMap.get(name);
			Collections.sort(linkedList, Person.zipcode);
			for (Person per : linkedList) {
				System.out.println(per);
			}
		}
	}

	/*
	 * searching person from any address book based on unique phone
	 * number
	 * 
	 * @see com.bridgelabz.service.AddressBook#searchPerson()
	 */
	@Override
	public void searchPerson() {
		System.out.println("\n Enter the phone number of person whose record you want to search  ");
		long searchnumber = scanner.nextLong();
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
						//p1.display();
						flag = true;
					}
				}
			}
		}
		if (!flag) {
			System.out.println("u entered invalid phone number ");
		}

	}

}

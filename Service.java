package com.bridgelabz.service;

import java.util.HashSet;

import com.bridgelabz.controller.AddressBookController;
import com.bridgelabz.model.Person;

/*Service class 
 * @author bridgeit
 *
 */
public class Service {
	AddressBook addressBook = new AddressBookController();

	public void createAddressBook() {
		addressBook.createAddressBook();
	}

	public void addPerson(String addressBookName1) {
		addressBook.addPerson(addressBookName1);
	}

	public void deletePerson() {
		addressBook.deletePerson();
	}

	public void updatePerson() {
		addressBook.updatePerson();
	}

	public void sortByName() {
		addressBook.sortByName();
	}

	public void sortByZip() {
		addressBook.sortByZip();
	}

	public void searchPerson() {
		addressBook.searchPerson();
	}

	
}

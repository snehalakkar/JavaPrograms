package com.bridgelabz.service;

import java.io.IOException;
import java.util.HashSet;

import com.bridgelabz.controller.AddressBookController;
import com.bridgelabz.model.Person;

/*Service class 
 * @author bridgeit
 *
 */
public class Service {
	AddressBook addressBook = new AddressBookController();
	//HashSet<Long> hashSet=new HashSet<>();
	//Person person=new Person();

	public void createAddressBook() throws ClassNotFoundException, IOException{
		addressBook.createAddressBook();
	}

	public void addPerson(String addressBookName1)  {
		addressBook.addPerson(addressBookName1);
	}

	public void deletePerson() throws ClassNotFoundException, IOException  {
		addressBook.deletePerson();
	}

	public void updatePerson() throws ClassNotFoundException, IOException {
		addressBook.updatePerson();
	}

	public void sortByName() throws ClassNotFoundException, IOException{
		addressBook.sortByName();
	}

	public void sortByZip() {
		addressBook.sortByZip();
	}

	public void searchPerson() {
		addressBook.searchPerson();
	}

	/*public void display() {
addressBook.display();		
	}
*/
	
}
package com.bridgelabz.service;

import java.io.IOException;

/**Interface AddressBook
 * @author bridgeit
 *
 */
public interface AddressBook {
	public void addPerson(String addressBookName1) throws ClassNotFoundException, IOException ;

	public void createAddressBook() throws ClassNotFoundException, IOException;

	public void deletePerson() throws ClassNotFoundException, IOException;

	public void updatePerson() throws ClassNotFoundException, IOException;

	public void sortByName() throws IOException, ClassNotFoundException;

	public void sortByZip();

	public void searchPerson();

	//public void display();
}
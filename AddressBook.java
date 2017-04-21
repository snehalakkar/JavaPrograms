package com.bridgelabz.service;

/**Interface AddressBook
 * @author bridgeit
 *
 */
public interface AddressBook {
	public void addPerson(String addressBookName1);

	public void createAddressBook();

	public void deletePerson();

	public void updatePerson();

	public void sortByName();

	public void sortByZip();

	public void searchPerson();
}

package com.bridgelabz.tester;

import java.util.Collections;
import java.util.Scanner;

import com.bridgelabz.service.Service;

/**Main class logic
 * @author bridgeit
 *
 */
public class MainClass {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Service service = new Service();
		System.out.println("****************Menu*****************");

		String answer;

		do {

			System.out.println(
					"\nchoices are :\n1. create AddressBook \n2. Add Person \n3. Delete Person \n4. Update Person \n5. SortByName \n6. SortByZip \n7.Search Person ");
			System.out.println("\nEnter your choice ");
			int choice = scanner.nextInt();

			switch (choice) {
			case 1:

				service.createAddressBook();
				break;
			case 2:
				System.out.println("\nGive the name to address book ");
				String addressBookName1 = scanner.next();
				service.addPerson(addressBookName1);
				break;
			case 3:
				service.deletePerson();
				break;
			case 4:
				service.updatePerson();
				break;
			case 5:

				service.sortByName();
				break;
			case 6:
				service.sortByZip();
				break;
			case 7:
				service.searchPerson();
				break;
			}
			System.out.println("\n Do you want to continue :? (yes/no) ");
			answer = scanner.next();
		} while (answer.equalsIgnoreCase("yes")||answer.equalsIgnoreCase("y"));

		if (answer.equalsIgnoreCase("no")||answer.equalsIgnoreCase("n")) {
			System.out.println("thank you.....");
		}
	}

}

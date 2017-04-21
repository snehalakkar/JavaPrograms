<<<<<<< HEAD
 package com.bridgelabz.programs;

import java.util.Scanner;

/**Find your number logic
 * @author bridgeit
 *
 */
=======
package com.bridgelabz.programs;

import java.util.Scanner;

>>>>>>> 346d642cbb818b23c5bf543496db5e13a25dbbc3
public class FindYourNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number :");
		int range = scanner.nextInt();

		System.out.println("Imagine any number between 0 to " + (range - 1));

		int first = 0;
		int last = range - 1;
		int mid = (first + last) / 2;
		boolean flag = false;
		System.out.println("Do you imagine any number ? (yes/no)");
		String ans1 = scanner.next();
		if (ans1.equalsIgnoreCase("yes")) {
			while (first <= last) {
				System.out.println("is your number is " + (mid) + " then press ok  \n if smaller than " + mid
						+ " then press yes \n if greater than " + mid + " press no ");
				String ans = scanner.next();

				if (ans.equalsIgnoreCase("ok")) {
					System.out.println("ur number is :" + mid);
					flag = true;
					break;

				}

				else if (ans.equalsIgnoreCase("yes")) {
					last = mid - 1;
				} else {
					first = mid + 1;
				}
				mid = (first + last) / 2;
			}
		}
		if (first > last)
			System.out.println("sorry u did not imagine any number ");
	}
<<<<<<< HEAD
}

=======
}
>>>>>>> 346d642cbb818b23c5bf543496db5e13a25dbbc3

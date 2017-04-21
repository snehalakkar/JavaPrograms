package com.bridgelabz.programs;

import java.util.Scanner;

/**
 * vending machine logic
 * 
 * @author bridgeit
 *
 */
public class VendingMachine {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] array = { 1000, 500, 100, 50, 10, 5, 2, 1 };

		System.out.println("\nEnter the amount which you want to entered in Rs ");
		int amount = scanner.nextInt();
		int count = 0;
		while (amount != 0.0) {
			for (int i = 0; i < array.length; i++) {
				int numOfNotes = amount / array[i];
				if (numOfNotes != 0) {
					count++;
					System.out.println(numOfNotes + " notes of  " + array[i]);
				}
				int newValue = numOfNotes * array[i];
				amount = amount - newValue;
			}
		}
		System.out.println("Total number of notes given by vending machine :" + count);
	}
}

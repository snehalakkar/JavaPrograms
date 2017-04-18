package com.bridgelabz.programs;

import java.util.Scanner;

public class FrogLogicMultipleWall {
	public static void main(String[] args) {
		int count = 0;
		int count1 = 0;
		System.out.println("\n Enter the starttime ");
		Scanner scanner = new Scanner(System.in);
		int startPosition = scanner.nextInt();

		System.out.println("\n Enter the increament value ");
		int increament = scanner.nextInt();
		System.out.println("\n Enter the value of decreament ");
		int decreament = scanner.nextInt();

		numberOfAttempt(startPosition, increament, decreament);

	}

	private static void numberOfAttempt(int startPosition, int increament, int decreament) {
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		int count1 = 0;

		System.out.println("\n Enter the number of wall ");
		int walls = scanner.nextInt();
		int wallsArray[] = new int[walls];

		System.out.println("\n Enter the height of first,second and third wall");

		for (int i = 0; i < wallsArray.length; i++) {
			wallsArray[i] = scanner.nextInt();
			System.out.println(wallsArray[i]);
			while (startPosition < wallsArray[i]) {
				count++;
				startPosition = startPosition + increament - decreament;

			}
			System.out.println("\n number of attempts for  wall  :" + count);
			count1 = count1 + count;
			System.out.println("\n toatal count required :" + count1);

		}
	}
}

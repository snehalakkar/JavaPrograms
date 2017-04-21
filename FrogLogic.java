package com.bridgelabz.programs;

import java.util.Scanner;

public class FrogLogic {
	public static void main(String[] args) {
		System.out.println("\n Enter the starttime ");
		Scanner scanner=new Scanner(System.in);
		int startPosition=scanner.nextInt();
		System.out.println("\n Enter the height of wall ");
		int wallHeight=scanner.nextInt();
		System.out.println("\n Enter the increament value ");
		int increament=scanner.nextInt();
		System.out.println("\n Enter the value of decreament ");
		int decreament=scanner.nextInt();

		numberOfAttempt(startPosition,increament,decreament,wallHeight);
	}



	private static void numberOfAttempt(int startPosition, int increament, int decreament,int wallHeight) {
		int progress=startPosition;
		int count=0;
		while (startPosition<wallHeight) {
			count++;
			startPosition=startPosition+increament-decreament;

		}
		System.out.println("\n number of attempts required :"+count);
	}

}

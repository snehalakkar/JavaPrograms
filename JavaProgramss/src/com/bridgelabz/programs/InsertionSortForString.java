package com.bridgelabz.programs;

import java.io.IOException;

import com.bridgelabz.utilityLogic.Utility;

public class InsertionSortForString {
	public static void main(String[] args) throws IOException {
		Utility utility = new Utility();
		String file = utility.filereadinglogic("wodinput.txt");
		String[] s1 = file.split(",");
		System.out.println("length :" + s1.length);
		System.out.println("Array elements before sorting are :");
		for (int i = 0; i < s1.length; i++)
			System.out.println(s1[i]);
		insertionSorting(s1);
	}

	private static void insertionSorting(String[] s1) {
		for (int i = 1; i < s1.length; i++)
			for (int j = i; j > 0; j--)
				if (s1[j].compareTo(s1[j - 1]) < 0) {
					String temp = s1[j];
					s1[j] = s1[j - 1];
					s1[j - 1] = temp;
				}

		System.out.println("\n Array elements after sorting are :");
		for (int i = 0; i < s1.length; i++)
			System.out.print(s1[i] + " ");
	}
}

package com.bridgelabz.programs;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

import com.bridgelabz.utilityLogic.Utility;

public class BinSearchOfWordList {
	public static void main(String[] args) throws IOException
	{
		Scanner scan=new Scanner(System.in);
		boolean status=false;
		
		String decision;
		
		do
		{
			searchlogic();
			System.out.println("Do you want to Continue: ? (yes/no)");
			decision=scan.next();
			if( decision.equalsIgnoreCase("yes"))
			{
				status=true;
			}else{
				System.out.println("Thank u");
				status=false;
			}
			
		}while(status);
		
	}

	public static void searchlogic() throws IOException {
		// boolean flag=false;

		Scanner scan = new Scanner(System.in);
		Utility u = new Utility();
		String str = u.filereadinglogic("wodinput.txt");
		String[] s1 = str.split(",");

		System.out.println("array elements before sort are");

		for (int i = 0; i < s1.length; i++) {
			System.out.print(s1[i] + " ");
		}
		
		System.out.println();
		System.out.println();
		Arrays.sort(s1);
		System.out.println("array elements after sort are");
		for (int i = 0; i < s1.length; i++) {
			System.out.print(s1[i] + " ");
		}
		System.out.println("\n\ncount of words present in file: " + s1.length);
		System.out.println();
		System.out.println("enter the word which u want to search");
		String search = scan.next();
		System.out.println();
		int first = 0;
		int last = s1.length - 1;

		while (first <= last) {
			int mid = (first + last) / 2;
			if (s1[mid].equals(search)) {
				System.out.println("element found at location " + (mid + 1));
				// flag=true;
				break;
			} else if (search.compareTo(s1[mid]) > 0) {
				first = mid + 1;
			} else {
				last = mid - 1;
			}
		}

		if (first > last) {
			System.out.println("element not found in the file");
		}

	}
}

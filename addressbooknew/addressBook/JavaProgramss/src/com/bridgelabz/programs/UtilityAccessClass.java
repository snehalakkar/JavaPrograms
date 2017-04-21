package com.bridgelabz.programs;
import java.util.Arrays;
import java.util.Scanner;
import com.bridgelabz.utilityLogic.Utility;

public class UtilityAccessClass {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Utility utility = new Utility();
		StopwatchBussiness sw = new StopwatchBussiness();

		long starttimeBinInt = sw.start();
		System.out.println("Binary Search for Int Array ");
		int[] intarray = utility.intarray();
		Arrays.sort(intarray);
		System.out.println("\n Enter the element which you want to search ");
		int searchint = scanner.nextInt();
		System.out.println("\n array elements after sorting are:");
		for (int i = 0; i < intarray.length; i++)
			System.out.println(intarray[i]);
		utility.binsearchForInt(intarray, searchint);
		long stoptimeBinInt = sw.stop();
		long elapsedtimeBinInt = sw.timeelapsed();
		System.out.println("---------------------------------------------------------");

		long starttimeBinString = sw.start();
		System.out.println("Binary Search for String Array ");
		String[] stringarray = utility.stringarray();
		Arrays.sort(stringarray);
		System.out.println("\n Enter the word which you want to search ");
		String searchword = scanner.next();
		System.out.println("\n array elements after sorting are:");
		for (int i = 0; i < stringarray.length; i++)
			System.out.println(stringarray[i]);
		utility.binsearchForString(stringarray, searchword);
		long stoptimeBinString = sw.stop();
		long elapsedtimeBinString = sw.timeelapsed();
		System.out.println("---------------------------------------------------------");

		long starttimeIntInsertion = sw.start();
		System.out.println("\nInsertion sort for int array ");
		int[] intarray1 = utility.intarray();
		utility.insertionSortingForInt(intarray1);
		long stoptimeIntInsertion = sw.stop();
		long elapsedtimeIntInsertion = sw.timeelapsed();
		System.out.println("---------------------------------------------------------");

		long starttimeStringInsertion = sw.start();
		System.out.println("\nInsertion sort for String array ");
		String[] stringarray1 = utility.stringarray();
		utility.insertionSortingForString(stringarray1);
		long stoptimeStringInsertion = sw.stop();
		long elapsedtimeStringInsertion = sw.timeelapsed();
		System.out.println("\n---------------------------------------------------------");

		long starttimeIntBubble= sw.start();
		System.out.println("Bubble sort for int array ");
		int[] intarray2 = utility.intarray();
		utility.bubbleSortingForInt(intarray2);
		long stoptimeIntBubble = sw.stop();
		long elapsedtimeIntBubble = sw.timeelapsed();
		System.out.println("\n---------------------------------------------------------");

		long starttimeStringBubble= sw.start();
		System.out.println("\nBubble sort for String array ");
		String[] stringarray2 = utility.stringarray();
		utility.bubbleSortingForString(stringarray2);
		long stoptimeStringBubble = sw.stop();
		long elapsedtimeStringBubble = sw.timeelapsed();
		System.out.println("---------------------------------------------------------");
	}
}

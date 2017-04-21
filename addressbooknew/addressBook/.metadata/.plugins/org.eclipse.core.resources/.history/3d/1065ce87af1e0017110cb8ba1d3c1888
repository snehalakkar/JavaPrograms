package com.bridgelabz.programs;

import com.bridgelabz.utilityLogic.Utility;

public class BubbleSortOfInt {
	public static void main(String[] args) {
		Utility utility = new Utility();

		int arr[] = utility.intarray();
		System.out.println("length :" + arr.length);
		bubbleSorting(arr);
	}

	private static void bubbleSorting(int[] arr) {
		int temp;
		for (int i = 0; i < arr.length; i++) //just to iterate upto the length
		
			for (int j = 0; j < arr.length-1; j++) //to swap 
			
				if (arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			
		System.out.println("array after sorting :");

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}

	}

}

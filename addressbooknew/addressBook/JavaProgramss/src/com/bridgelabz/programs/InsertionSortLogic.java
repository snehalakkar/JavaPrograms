package com.bridgelabz.programs;

import com.bridgelabz.utilityLogic.Utility;

public class InsertionSortLogic {
	public static void main(String[] args) {
		Utility utility = new Utility();
		int arr[] = utility.intarray();
		System.out.println("length :" + arr.length);
		insertionSorting(arr);
	}

	private static void insertionSorting(int[] arr) {

		for (int i = 1; i < arr.length; i++)// just for iterating
		
			for (int j = i; j >0; j--) // to perform swapping with previous
			
				if (arr[j] < arr[j - 1]) {
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				}
					

		System.out.println("array after sorting :");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
	}
}
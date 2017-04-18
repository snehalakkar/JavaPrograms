package com.bridgelabz.programs;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

import com.bridgelabz.utilityLogic.Utility;

public class HashingFunction {
	public static void main(String[] args) throws IOException {
		Utility utility = new Utility();
		int remainder = 0;
		Scanner scanner = new Scanner(System.in);
		String result = utility.filereadinglogic("input.txt");
		String[] stringArray = result.split(",");
		// System.out.println(stringArray.length);
		int[] intArray = new int[stringArray.length];
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = Integer.parseInt(stringArray[i]);
		}

		LinkedList<Integer> linkedList = new LinkedList<>();
		HashMap<Integer, LinkedList<Integer>> hashMap = new HashMap<Integer, LinkedList<Integer>>();

		for (int i = 0; i <=intArray.length; i++) {
			hashMap.put(i, new LinkedList<>());
		}

		//LinkedList<Integer> linkedList2 = null;

		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		System.out.println("hashmap :" + hashMap.size());
		System.out.println("intArray size:"+intArray.length);

		//LinkedList<Integer> linkedList2 = new LinkedList<>();

		for (int i = 0; i <intArray.length; i++) {
			remainder = intArray[i] % (intArray.length + 1);
			// System.out.println(remainder);
			LinkedList<Integer> linkedList2 = hashMap.get(remainder);
			linkedList2.add(intArray[i]);
			hashMap.put(remainder, linkedList2);
		}

		System.out.println("\n enter the number which you want to search from the slot ");
		int search = scanner.nextInt();

		//LinkedList<Integer> linkedList3 = new LinkedList<>();
		int rem = search % (intArray.length + 1);
		LinkedList<Integer> linkedLists = hashMap.get(rem);
		for (int i = 0; i < linkedLists.size(); i++) {
			if (linkedLists.contains(search)) {
				System.out.println("element found at index " + (i + 1) + " we have to remove the element ");
				linkedLists.remove(i);
				System.out.println(hashMap);
			} else {
				System.out.println("\nelement not found thus we have to insert the element ");
				linkedLists.add(i, search);
				System.out.println(hashMap);
				break;
			}
		}

	}
}

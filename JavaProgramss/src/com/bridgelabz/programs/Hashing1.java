package com.bridgelabz.programs;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

import com.bridgelabz.utilityLogic.Utility;
public class Hashing1 {
	
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

			for (int i = 0; i <= intArray.length; i++) {
				hashMap.put(i, new LinkedList<>());
			}

			LinkedList<Integer> linkedList2 = null;
			for (int i = 0; i < intArray.length; i++)
				System.out.println(intArray[i]);
			System.out.println("hashmap" + hashMap.size());
			for (int i = 0; i < intArray.length; i++) {

				remainder = intArray[i] % (intArray.length + 1);
				System.out.println(remainder);
				linkedList2 = hashMap.get(remainder);
				linkedList2.add(intArray[i]);
				hashMap.put(remainder, linkedList2);
			}
			System.out.println(hashMap);
			System.out.println("\n enter the number which you want to search from the slot ");
			int search = scanner.nextInt();

			int rem = search % (intArray.length + 1);
			LinkedList<Integer> linkedList3 = hashMap.get(rem);
			for (int i = 0; i < linkedList3.size(); i++) {
				if (search == linkedList3.get(i)) {
					System.out.println("element found at index " + (i + 1));
					linkedList3.remove(i);
				} else {
					System.out.println("\nelement not found ");
					linkedList3.add(i, rem);
					break;

				}
			}

		}
	}



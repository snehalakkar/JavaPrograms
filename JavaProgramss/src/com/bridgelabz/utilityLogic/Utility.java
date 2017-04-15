package com.bridgelabz.utilityLogic;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Utility {
	Scanner scanner = new Scanner(System.in);

	/**
	 * take file name as input and store its contains into string variable using
	 * filereader and bufferreaderf
	 * 
	 * @param name
	 *            i.e,any file
	 * @return string
	 * @throws IOException
	 */
	public String filereadinglogic(String inputFile) throws IOException {
		FileReader fileReader = null;
		BufferedReader bufferedReader = null;
		try {
			fileReader = new FileReader(inputFile);
			bufferedReader = new BufferedReader(fileReader);

			String line = "";
			String s = "";

			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
				s = s + line + ",";
			}
			return s;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (bufferedReader != null) {
				bufferedReader.close();
			}
			if (fileReader != null) {
				fileReader.close();
			}
		}
		return inputFile;

	}

	/**
	 * @param str[]
	 * @return int[]
	 * @throws IOException
	 */
	public int[] intarray(String[] stringarray) throws IOException {
		int intarray[] = new int[stringarray.length];
		for (int i = 0; i < stringarray.length; i++) {
			intarray[i] = Integer.parseInt(stringarray[i]);
		}
		return intarray;

	}

	/**
	 * @param stringarr
	 * @return floatarr
	 * @throws IOException
	 */
	public float[] floatarray(String[] stringarray) throws IOException {
		float floatarray[] = new float[stringarray.length];
		for (int i = 0; i < stringarray.length; i++) {
			floatarray[i] = Float.parseFloat(stringarray[i]);
		}
		return floatarray;

	}

	/**
	 * @param stringarr
	 * @return doublearr
	 * @throws IOException
	 */
	public double[] doublearray(String[] stringarray) throws IOException {
		double doublearray[] = new double[stringarray.length];
		for (int i = 0; i < stringarray.length; i++) {
			doublearray[i] = Double.parseDouble(stringarray[i]);
		}
		return doublearray;

	}

	/**
	 * @return create int array
	 */
	public int[] intarray() {

		System.out.println("\nenter the size of array :");
		int n = scanner.nextInt();
		int intarray[] = new int[n];
		System.out.println("\nenter the array elements");
		for (int i = 0; i < n; i++)
			intarray[i] = scanner.nextInt();

		System.out.println("\narray elements are");
		for (int i = 0; i < n; i++) {
			System.out.print(intarray[i] + " ");
		}
		System.out.println();
		return intarray;
	}

	/**
	 * @return create chararray
	 */
	public char[] chararray() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("\nenter the size of array :");
		int n = scanner.nextInt();
		char chararray[] = new char[n];
		System.out.println("\nenter the array elements");
		for (int i = 0; i < n; i++)
			chararray[i] = scanner.next().charAt(i);

		System.out.println("\narray elements are");
		for (int i = 0; i < n; i++)
			System.out.print(chararray[i] + " ");

		System.out.println();
		return chararray;
	}

	/**
	 * create string array
	 * param no input 
	 * @return string[]
	 */
	public String[] stringarray() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("\nenter the size of array :");
		int n = scanner.nextInt();
		String stringarr[] = new String[n];
		System.out.println("\nenter the array elements");
		for (int i = 0; i < n; i++)
			stringarr[i] = scanner.next();

		System.out.println("\narray elements are");
		for (int i = 0; i < n; i++)
			System.out.print(stringarr[i] + " ");

		System.out.println();
		return stringarr;
	}

	/**
	 * @return create doublearr
	 */
	public double[] doublearr() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("\nenter the size of array :");
		int n = scanner.nextInt();
		double doublearray[] = new double[n];
		System.out.println("\nenter the array elements");
		for (int i = 0; i < n; i++)
			doublearray[i] = scanner.nextDouble();

		System.out.println("\narray elements are");
		for (int i = 0; i < n; i++)
			System.out.print(doublearray[i] + " ");

		System.out.println();
		return doublearray;
	}

	/**
	 * bubble sort for int array
	 * 
	 * @param arr
	 */
	public void bubbleSortingForInt(int[] array) {
		int temp;
		for (int i = 0; i < array.length; i++) // just to iterate upto the
												// length

			for (int j = 0; j < array.length - 1; j++) // to swap

				if (array[j] > array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}

		System.out.println("\narray after sorting :");

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i] + " ");
		}

	}

	/**
	 * bubble Sorting For String array
	 * 
	 * @param arr
	 */
	public void bubbleSortingForString(String[] array) {
		String temp;
		for (int i = 0; i < array.length; i++) // just to iterate upto the
												// length

			for (int j = 0; j < array.length - 1; j++) // to swap

				if (array[j].compareTo(array[j + 1]) > 0) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}

		System.out.println("\narray after sorting :");

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i] + " ");
		}
	}

	/**
	 * insertion Sorting For String array
	 * 
	 * @param s1
	 */
	public void insertionSortingForString(String[] s1) {
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

	/**
	 * insertion Sorting For Int Array
	 * 
	 * @param s1
	 */
	public void insertionSortingForInt(int[] s1) {
		for (int i = 1; i < s1.length; i++)
			for (int j = i; j > 0; j--)
				if (s1[j] < s1[j - 1]) {
					int temp = s1[j];
					s1[j] = s1[j - 1];
					s1[j - 1] = temp;
				}

		System.out.println("\n Array elements after sorting are :");
		for (int i = 0; i < s1.length; i++)
			System.out.print(s1[i] + " ");
	}

	/**
	 * binary search For String Array
	 * 
	 * @param sortedArr
	 * @param search
	 */
	public void binsearchForString(String[] sortedArr, String search) {
		int first = 0;
		int last = sortedArr.length - 1;

		while (first <= last) {
			int mid = (first + last) / 2;
			if (sortedArr[mid].equalsIgnoreCase(search)) {
				System.out.println("\n element found at location " + (mid + 1));
				// flag=true;
				break;
			} else if (search.compareTo(sortedArr[mid]) > 0) {
				first = mid + 1;
			} else {
				last = mid - 1;
			}
		}
		if (first > last) {
			System.out.println("\nelement not found in the file");
		}
	}

	/**
	 * binary search For Int Array
	 * 
	 * @param sortedArr
	 * @param search
	 */
	public void binsearchForInt(int[] sortedArr, int search) {
		int first = 0;
		int last = sortedArr.length - 1;

		while (first <= last) {
			int mid = (first + last) / 2;
			if (sortedArr[mid] == search) {
				System.out.println("\n element found at location " + (mid + 1));
				// flag=true;
				break;
			} else if (search > (sortedArr[mid])) {
				first = mid + 1;
			} else {
				last = mid - 1;
			}
		}
		if (first > last) {
			System.out.println("\n element not found in the file");
		}
	}
}

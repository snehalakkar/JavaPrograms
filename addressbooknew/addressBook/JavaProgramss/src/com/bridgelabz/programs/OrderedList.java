package com.bridgelabz.programs;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
import com.bridgelabz.utilityLogic.Utility;

/**
 * orderedList programme
 * 
 * @author bridgeit
 *
 */
public class OrderedList {
	public static void main(String[] args) throws IOException {
		Utility utility = new Utility();
		Scanner scanner = new Scanner(System.in);

		String string = utility
				.filereadinglogic("/home/bridgeit/JavaPrograms/JavaProgramss/text files/integerinput.txt");
		String[] stringarray = string.split(",");
		System.out.println("string present in file is :" + stringarray);
		int[] intarray = new int[stringarray.length];
		intarray = conversionLogic(stringarray);

		System.out.println("\n Enter the element which you want to search ");
		int search = scanner.nextInt();

		linkedlistOperations(intarray, search);
	}

	/**
	 * adding or removing elements from linkedlist
	 * 
	 * @param intarray
	 * @param search
	 * @throws IOException
	 */
	private static void linkedlistOperations(int[] intarray, int search) throws IOException {
		int count = 0;
		 FileWriter fileWriter=null;
		 BufferedWriter bufferedWriter=null;
		LinkedList<Integer> linkedlist = new LinkedList<Integer>();
		for (int i = 0; i < intarray.length; i++) {
			linkedlist.add(intarray[i]);
		}

		if (linkedlist.contains(search)) {
			System.out.println(linkedlist.remove(linkedlist.indexOf(search)));
		} else {
			linkedlist.add(search);
		}

		// to sort linkedlist
		Collections.sort(linkedlist);
		System.out.println("\n LinkedList after performing operations ");

		// iterating using for each loop
		for (int i : linkedlist) {
			count++;
			System.out.println(i);
		}

		String st = "";
		for (int i = 0; i < count; i++) {
			st += linkedlist.get(i) + " ";
		}
		System.out.println("string is: " + st);
		
		try{
			File file=new File("outputfile.txt");

			//this logic is to check file created or not 
			if(!file.exists())
			{
				file.createNewFile();
			}

			fileWriter=new FileWriter("/home/bridgeit/JavaPrograms/JavaProgramss/text files/integerinput.txt");
			bufferedWriter =new BufferedWriter(fileWriter);

			//writng a file
			bufferedWriter.write(st);
			System.out.println("File Written Successfully....");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
	
			
			if(bufferedWriter!=null)
			{
				bufferedWriter.flush();
				bufferedWriter.close();
			
			}
		}
	}

	/**
	 * converting string[] to int[]
	 * 
	 * @param stringarray
	 * @return intarray
	 */
	private static int[] conversionLogic(String[] stringarray) {
		int[] intarray = new int[stringarray.length];
		// convert string array to int array
		for (int i = 0; i < stringarray.length; i++) {
			intarray[i] = Integer.parseInt(stringarray[i]);
		}

		// printing int array
		System.out.println("\ncontents of int array :");
		for (int i = 0; i < intarray.length; i++) {
			System.out.print(intarray[i] + " ");
		}
		return intarray;
	}
}

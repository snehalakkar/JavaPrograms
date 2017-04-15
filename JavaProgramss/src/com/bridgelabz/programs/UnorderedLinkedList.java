package com.bridgelabz.programs;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

import com.bridgelabz.utilityLogic.Utility;

public class UnorderedLinkedList {
	public static void main(String[] args) throws IOException {
		Scanner scanner=new Scanner(System.in);
		Utility utility=new Utility();
		int count=0;
		FileWriter fileWriter=null;
		BufferedWriter bufferedWriter=null;

		String inputFile=utility.filereadinglogic("wodinput.txt");
		String[] wordArray=inputFile.split(",");

		LinkedList<String> linkedList=new LinkedList<String>();
		for (int i = 0; i < wordArray.length; i++) {
			linkedList.add(wordArray[i]);
		}

		System.out.println("Enter the word which you want to search from Linkedlist ");
		String search=scanner.next();

		boolean result=linkedList.contains(search);
		System.out.println("\nword present :"+result);

		if(result==true)
		{
			linkedList.remove(search);
		}
		else
		{
			linkedList.add(search);
		}

		System.out.println("\n linkedlist after performing operation ");
		Iterator<String> iterator=linkedList.iterator();
		while(iterator.hasNext())
		{
			count++;
			System.out.println(iterator.next());
		}

		String[] stringarray =new String[count];

		for (int i = 0; i < stringarray.length; i++) {
			stringarray[i]=linkedList.get(i);
		}

		//to convert string array to string
		String stringOfWords=Arrays.toString(stringarray);
		System.out.println("\n "+stringOfWords);

		
		try{
			File file=new File("outputfile.txt");

			//this logic is to check file created or not 
			if(!file.exists())
			{
				file.createNewFile();
			}

			fileWriter=new FileWriter("outputfile.txt");
			bufferedWriter =new BufferedWriter(fileWriter);

			//writng a file
			bufferedWriter.write(stringOfWords);
			System.out.println("File Written Successfully....");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		//closing costly resources
		finally {
			/*if(fileWriter!=null)
				
			{/*if(bufferedWriter!=null)
			{
				bufferedWriter.flush();
			}*/
				/*fileWriter.flush();
				fileWriter.close();	*/
			
			if(bufferedWriter!=null)
			{
				bufferedWriter.flush();
				bufferedWriter.close();
			
			}
		}

	}
}

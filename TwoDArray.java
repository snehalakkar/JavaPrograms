package com.bridgelabz.programs;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import com.bridgelabz.utilityLogic.Utility;
public class TwoDArray {



	public static void main(String[] args) throws IOException 
	{
		
		takeinput();
		
	}
	public static void takeinput() throws IOException 
	{
		Scanner scan =new Scanner(System.in);
		Utility u=new Utility();
		String s2=u.filereadinglogic("input.txt");
		System.out.println(s2);
		String[] s1=s2.split(",");
		int intarr[]=new int[s1.length];

		for(int i=0;i<s1.length;i++)
		{
			intarr[i]=Integer.parseInt(s1[i]);
		}

		System.out.println("1D array elements are :");
		for(int j=0;j<s1.length;j++)
		{
			System.out.println(intarr[j]);
		}


		System.out.println("Enter number of rows :");
		int r=scan.nextInt();

		System.out.println("Enter number of cols :");
		int c=scan.nextInt();
		int intTwo[][]=new int[r][c];
		int count=0;
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				intTwo[i][j]=Integer.parseInt(s1[count]);
				count++;
			}

		}


		System.out.println("2D array elements are :");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				if(intTwo[i][j]<10)
					System.out.print(intTwo[i][j]+"  ");
				else
					System.out.print(intTwo[i][j]+" ");
			}
			System.out.println();
		}


	}
}


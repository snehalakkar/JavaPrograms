package com.bridgelabz.programs;

import com.bridgelabz.utilityLogic.Utility;

public class SumOf3Int
{
	public static void main(String[] args) {

		System.out.println("programme started");
		int sum=0;

		Utility u=new Utility();
		int[] arr=u.buildarray();
		int n=arr.length;
		checklogic(n,arr,sum);
		System.out.println("programme Ended");
	}

	public static void checklogic(int n,int arr[],int sum)
	{
		int count=0;
		for(int i=0;i<n-2;i++){
			for(int j=i+1;j<n-1;j++){
				for(int k=j+1;k<n;k++){
					if(arr[i]+arr[j]+arr[k]==sum){	
						count++;
						System.out.println(arr[i]+ " "+arr[j]+" "+arr[k]);	
						System.out.print("are triplets having sum equal to zero");
						System.out.println("");
					}
				}
			}
		}
		System.out.println("count is"+count);
	}
}

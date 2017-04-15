package com.bridgelabz.programs;

import java.util.Scanner;

public class Stopwatch {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		StopwatchBussiness sw=new StopwatchBussiness();

		long starttime=sw.start();
		System.out.println(starttime);
			System.out.println("Do you want to stop the timer ?(yes/no) ");
		String decision=scan.next();
		
		if(decision.equals("yes"))
		{
		long stoptime=sw.stop();
		System.out.println(stoptime);
		}
		sw.timeelapsed();
	}
}

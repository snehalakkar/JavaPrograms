
package com.bridgelabz.programs;

import java.util.Scanner;

class StockLogic1 {
	String stockname;
	int sharenumber;
	long shareprice;

	StockLogic1(String stockname, int sharenumber, long shareprice) {
		this.stockname = stockname;
		this.sharenumber = sharenumber;
		this.shareprice = shareprice;
	}
}

public class StockReports {
	public static void main(String[] args) {
		long totalvalueofeachstock;
		long sum = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter number of companies ");
		int n = scan.nextInt();

		StockLogic1 st[] = new StockLogic1[n];
		for (int i = 0; i < n; i++) {
			System.out.println("enter stock name:");
			String stockname = scan.next();
			System.out.println("enter number of shares ");
			int sharenumber = scan.nextInt();
			System.out.println("enter price of shares ");
			long shareprice = scan.nextInt();

			System.out.println();

			st[i] = new StockLogic1(stockname, sharenumber, shareprice);
		}

		System.out.println("Stockname  " + "  sharenumber  " + "  share price  " + "  totalvalueofeachstock  ");
		for (int i = 0; i < st.length; i++) {
			totalvalueofeachstock = (st[i].sharenumber * st[i].shareprice);
			System.out.println(st[i].stockname + " \t \t" + st[i].sharenumber + " \t\t " + st[i].shareprice + " \t\t "
					+ totalvalueofeachstock);
			sum = sum + totalvalueofeachstock;
		}

		System.out.println();
		System.out.println("toal value of all stocks " + sum);
	}
}

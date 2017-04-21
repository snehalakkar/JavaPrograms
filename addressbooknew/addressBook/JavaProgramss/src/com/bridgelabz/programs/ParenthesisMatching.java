package com.bridgelabz.programs;

import java.util.Scanner;
import java.util.Stack;

public class ParenthesisMatching {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the expression to match the parenthesis :");
		String expression = scanner.next();
		Stack<Character> stack = new Stack<Character>();
		int count1 = 0;
		int count2 = 0;
		// int top = -1;
		boolean flag = false;
		boolean flag1=false;

		for (int i = 0; i < expression.length(); i++) {
			if (expression.charAt(i) == '(') {
				stack.push(expression.charAt(i));
				System.out.println("peek :" + stack.peek());
				System.out.println("size at push: " + stack.size());
			}

			else if (expression.charAt(i) == ')') {
				try {
					stack.pop();
					System.out.println("size at pop: " + stack.size());
				} catch (Exception e) {
					System.out.println("'}' or ')' is unmatched paranhesis  ");
					flag = true;

				}
			}
		}
		if (!flag) {
			if (stack.isEmpty()) {
				System.out.println("\nparenthesis are matching ");
			} else {
				System.out.println("\nparenthesis are not matching ");
			}
		}
		
		for (int i = 0; i < expression.length(); i++) {
			if (expression.charAt(i) == '{') {
				stack.push(expression.charAt(i));
				System.out.println("peek :" + stack.peek());
				System.out.println("size at push: " + stack.size());
			}

			else if (expression.charAt(i) == '}') {
				try {
					stack.pop();
					System.out.println("size at pop: " + stack.size());
				} catch (Exception e) {
					System.out.println("'}' or ')' is unmatched paranhesis  ");
					flag1 = true;

				}
			}
		}
		if (!flag1) {
			if (stack.isEmpty()) {
				System.out.println("\nparenthesis are matching ");
			} else {
				System.out.println("\nparenthesis are not matching ");
			}
		}
	}
}

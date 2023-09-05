package com.example;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		
		while(cin.hasNext()) {
			int operandA = cin.nextInt();
			int operandB = cin.nextInt();
			
			int result = add(operandA, operandB);
			
			System.out.println("Result: " +result);
		}
	}

	public static int add(int a, int b) {
		int c = a+b;
		return c;
	}
}

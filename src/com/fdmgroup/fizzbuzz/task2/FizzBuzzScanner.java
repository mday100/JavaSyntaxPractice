package com.fdmgroup.fizzbuzz.task2;

import java.util.Scanner;

public class FizzBuzzScanner {

	public int scanner() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please type a number from 1 to 100");
		int input = scan.nextInt();
		System.out.println("FizzBuzz will now start from: " + input);
		return input;
		
	}
	
}

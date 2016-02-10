package com.fdmgroup.fizzbuzz.task2;

public class FizzBuzzRunner {

	public void fizzBuzz(int number) {
		for (int num = number; num <= 100; num++) {
			if ((num%3 == 0) && (num%5 == 0))
				System.out.print("FizzBuzz");
			else if (num%3 == 0)
				System.out.print("Fizz");
			else if (num%5 == 0)
				System.out.print("Buzz");
			else 
				System.out.print(num);
			System.out.println(" "); 
		}
	}
	
}
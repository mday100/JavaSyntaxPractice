package com.fdmgroup.fizzbuzz.task2;

public class Client {

	public static void main(String[] args) {
		FizzBuzzScanner input = new FizzBuzzScanner();
		FizzBuzzRunner runner = new FizzBuzzRunner();
		runner.fizzBuzz(input.scanner());
			
	}

}
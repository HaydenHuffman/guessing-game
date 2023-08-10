package com.coderscampus;

import java.util.Random;
import java.util.Scanner;

public class Assignment2Application {

	public static void main(String[] args) {
		Random random = new Random();
		int count = 0;
		int answer = 1 + random.nextInt(99);
		System.out.println("Pick a number between 1 and 100");
		Scanner scanner = new Scanner(System.in);
		int guess = scanner.nextInt();
		while (guess < 1 || guess > 100) {
			System.out.println("Your guess is not between 1 and 100, please try again");
			guess = scanner.nextInt();
		}
		while (count < 5 ) {
			if (guess > answer) {
				System.out.println("Please pick a lower number");
				count++;
				guess = scanner.nextInt();
			} else if (guess < answer) {
				System.out.println("Please pick a higher number");
				count++;
				guess = scanner.nextInt();
			} else {
				System.out.println("You win!");
				break;
			}
		}
		if (count == 5) {
			System.out.println("You lose, the number to guess was " + answer);
		}

	}

}

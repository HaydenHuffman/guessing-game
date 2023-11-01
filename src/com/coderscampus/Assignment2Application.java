package com.coderscampus;

import java.util.Random;
import java.util.Scanner;

public class Assignment2Application {
// THIS IS A COMMENT!!!
    public static void main(String[] args) {
        int count = 0;
        Random random = new Random();
        Integer answer = 1 + random.nextInt(99);
        System.out.println("Pick a number between 1 and 100");
        Boolean result = false;
        while (count < 5 && !result) {
            result = playGame(answer, count);
            count++;
        }
        if (count == 5 && !result) {
            System.out.println("You lose, the number to guess was " + answer);
        }
    }

    public static Integer getGuess() {
        Scanner scanner = new Scanner(System.in);
        Integer guess = scanner.nextInt();
        while (guess < 1 || guess > 100) {
            System.out.println("Your guess is not between 1 and 100, please try again");
            guess = scanner.nextInt(); // Read another guess
        }
        return guess;
    }

    public static Boolean playGame(Integer answer, Integer count) {
        Integer guess = getGuess();
        if (guess == answer) {
            System.out.println("You win!");
            return true;
        } else if (guess > answer && count < 4) {
            System.out.println("Please pick a lower number");
        } else if (guess < answer && count < 4) {
            System.out.println("Please pick a higher number");
        }
        return false;
    }
}
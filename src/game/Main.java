package game;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int attempt = 1;
        int userGuessNumber = 0;
        int secretNumber = (int) (Math.random() * 99 + 1);

        Scanner userInput  = new Scanner(System.in);
        System.out.println("Welcome to my Guess Number Game \nYou will be asked to guess a number to win the game \nYou have 5 shots!");

        do {
            System.out.println("Enter a number between 1 and 100\n");

            if (userInput.hasNextInt()) {
                userGuessNumber = userInput.nextInt();

                if (userGuessNumber == secretNumber) {
                    System.out.println("WOOOOOOW! Your number is correct! YOU WIN!");
                    break;
                } else if (userGuessNumber < secretNumber) {
                    System.out.println("Your number is smaller!");
                } else if (userGuessNumber > secretNumber) {
                    System.out.println("Your number is greater!");
                }
                if (attempt == 5) {
                    System.out.println("You have exceeded the maximum attempt. Try again!");
                    break;
                }
                attempt++;
            } else {
                System.out.println("Enter a valid integer number.");
                break;
            }
        } while (userGuessNumber != secretNumber);
    }
}

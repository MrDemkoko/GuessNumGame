import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("\t*Hey! This is a number guessing game*\n");
        Scanner scanner = new Scanner(System.in);

        for(;;) {

            System.out.println("***\n1 - Play\n0 - Quit\n***");

            if(scanner.hasNextInt()) {

                int menuOption = scanner.nextInt();

                if(menuOption == 1) {

                    System.out.println("Enter the range of numbers you want to guess from:");

                    if(scanner.hasNextInt()) {

                        int rangeInput = scanner.nextInt();

                        if(rangeInput <= 0) {
                            System.out.println("Invalid range: enter value greater than 0");
                            return;
                        }

                        Random random = new Random();
                        int randomNumber = random.nextInt(rangeInput + 1);

                        System.out.println("Great! Guess the number from 0 to " + rangeInput);

                        for(;;) {

                            System.out.println("Enter your guess:");
                            if(scanner.hasNextInt()) {

                                int userGuess = scanner.nextInt();
                                if (userGuess == randomNumber) {
                                    System.out.println("You have guessed the number! Congrats!");
                                    break;
                                } else {
                                    System.out.println("Wrong one( Try again");
                                }

                            } else {
                                System.out.println("Invalid input: not a number");
                                scanner.next();
                            }

                        }

                    } else {
                        System.out.println("Invalid input: not a number");
                        scanner.next();
                    }
                } else if(menuOption == 0) {
                    break;
                } else {
                    System.out.println("Invalid input: not an option");
                }
            }
        }
        scanner.close();
    }
}
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        int RandomNumber = new Random().nextInt(10);
        System.out.println("Guess the number from 0 to 9 :3");
        
        while (true) {

            System.out.println("Type your guess:");
            int GuessNumber = new Scanner(System.in).nextInt();

            if (GuessNumber == RandomNumber) {
                System.out.println("Wow! You have guessed the number correctly!");
                break;
            } else {
                System.out.println("You didn\'t guess the number right(( Try again...");
            }

        }
    }
}
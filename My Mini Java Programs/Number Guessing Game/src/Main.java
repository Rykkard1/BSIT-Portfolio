import java.util.Random;
import java.util.Scanner;


public class Main{
    public static void main (String[] args) {
        //NUMBER GUESSING GAME

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;
        int attempts = 0;
        int min;
        int max;

        //INTRO
        System.out.println("Number Guessing Game");

        //SETTINGS
        System.out.print("Enter minimum number: ");
        min = scanner.nextInt();
        System.out.print("Enter maximum number: ");
        max = scanner.nextInt();

        System.out.printf("Guess a number between %d-%d\n" , min , max);


        int randomNumber = random.nextInt(min, max);

        //GAME
        do{
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if(guess>randomNumber){
                System.out.println("Too high!");
            }
            else if(guess<randomNumber) {
                System.out.println("Too low!");
            }

        } while(guess != randomNumber);

        System.out.println("You have won!");
        System.out.println("Attempts: "+ attempts);

    }
}
package q2;

import java.util.Random;
import java.util.Scanner;

/**
 // ************************************************************
 // Guess.java
 //
 // Play a game where the user guesses a number from 1 to 100
 // inclusive.
 // ************************************************************
 * @author Rupinder
 * @version 1.0
 */
public class Guess {

    /**
     * Variable to store numeric value 100.
     */
    private static final int HUNDRED = 100; 
    /**
     // ---------------------------------------------------------------
     // Play a game where the user guesses a number from 1 to 100
     // inclusive.
     // --------------------------------------------------------------
     * @param args command line arguments.
     */
    public static void main(String[] args) {
       
        int numGuess;
        int guess;
        int incorrectGuess = 0;
        String permission = "y";
         
        // Scanner objects created to read user input.
        Scanner scan = new Scanner(System.in);
        Scanner scan1 = new Scanner(System.in);
        // Random object created.
        Random generator = new Random();
        
        // runs the whole guessing game. 
        while (permission.equalsIgnoreCase("y")) {
        
            // Generates a random number between 1 and 100 (inclusive).
            guess = generator.nextInt(HUNDRED) + 1;
            // prompt user to input value.
            System.out.println("Please enter an integer"
                                         + " between 1 and 100 (inclusive): ");
            numGuess = scan.nextInt();
            // Checks if input is in range and prompts user to re-enter if 
            // input found out of range.(alternate way to throw exception)
            if (numGuess <= 0 || numGuess > HUNDRED) {
                
                System.out.println("Entered integer is not a vaild integer "
                                            + "between 1 and 100 (inclusive).");
                continue;
            }
            // checks if input matches the guess and determine input greater
            // than or less than guess if input doesn't match guess.
            while (numGuess != 0 && guess != numGuess) {
                
                if (numGuess > guess) {
                            
                    incorrectGuess++;
                    System.out.println("Guess is higher"
                                                 + " than the expected value.");
                } else {
                    
                    incorrectGuess++;
                    System.out.println("Guess is lower"
                                                 + " than the expected value.");
                }
                System.out.println("Please enter an integer between"
                                             + " 1 and 100 (inclusive) or enter"
                                             + " 0 to quit: ");
                numGuess = scan.nextInt();
                // throws exception if user inputs a value out of allowed range.
                if (numGuess > HUNDRED || numGuess < 0) {
                    
                
                    throw new IllegalStateException("Entered integer "
                                           + "is not a vaild integer "
                                           + "between 1 and 100 (inclusive).");
                }
            }   
            //prints a greeting if user input matches the guess.
            if (guess == numGuess) {
                 
                System.out.println("Congratulations your Guess: " 
                                             + guess + " was right");
                System.out.println("Total number of Incorrect Guesses: " 
                                    + incorrectGuess);                
            }
            // Asks user whether to play-again upon either winning
            // quitting out of the guess game.
            System.out.println("Play again (y/n): ");
            permission = scan1.nextLine();
            // checks the user input matches the required "y/Y" or
            // "n/N" and throws exception if no-match is found.
            if (!permission.equalsIgnoreCase("y") 
                    && !permission.equalsIgnoreCase("n")) {
                
                throw new IllegalStateException("Input did not match"
                                                     + " \"y/Y\" or \"n/N\".");
            }
        }
        // Prints last good-bye greeting if user quits the game. 
        System.out.println("Thanks for playing, Good-bye !!!!");
    }
}

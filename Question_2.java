import java.util.Scanner;

import java.util.Random;
/**

 * Play a game where the user guesses a number from 1 to 10*/

public class Question_2 {
     

    public static void main(String[] args) {

        final int num = 30;

        int numToGuess;             //Number the user tries to guess

        int guess;                 //The user's guess

        int count = 0;

 

        Scanner scan = new Scanner(System.in);

        Random generator = new Random();

 

        //randomly generate the number from 1-10 to guess
    numToGuess = generator.nextInt(num) + 1;

        //print message asking user to enter a guess

        System.out.print("Please guess the random number: ");
      guess = scan.nextInt();

        //read in guess

        while (numToGuess != guess)  //Keep going as long as the guess is wrong
        {
            //print message saying guess is wrong

            System.out.println("You guessed a wrong number.");

            // print the number as low or high

            if (guess > numToGuess) {

                System.out.println("The number is too high.");

            } else if (guess < numToGuess) {

                System.out.println("The number is too low.");

            }

            //get another guess from the user

            System.out.print("Please guess another number: ");

            guess = scan.nextInt();

            count++;

        }

       // print message saying guess is right.

        System.out.println("Matching, congratulation!!! ");

        System.out.println("Found after " + count + " guesses");

    }

}



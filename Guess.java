import java.util.Random;
import java.util.Scanner;

/**
 * <p>
 * This program pick a random number between 1 and 100 and then repeatedly
 * prompt the user to guess the number unless user enter N to finish.
 * </p>
 * 
 * @author Mao Sato set 1E
 * @version 1.0
 */
public class Guess {
    /**
     * <p>
     * This is the main method (entry point) that gets called by the JVM.
     * </p>
     * 
     * @param args
     *            command line arguments.
     */
    public static void main(String[] args) {
        final int max = 100;
        // Number the user tries to guess
        int numToGuess;
        // The user's guess
        int guess;
        Scanner scan = new Scanner(System.in);
        Random generator = new Random();
        // randomly generate the number to guess
        guess = generator.nextInt(max) + 1;

        String again = "Y";
        do {
            // print message asking user to enter a guess
            System.out.println("I'm thinking of a number between 1 and " + max
                    + ". Guess what it is: ");
            // read in guess
            numToGuess = scan.nextInt();
            scan.nextLine();
            String end = "Y";
            int numAns = 1;
            // evaluate the result
            while (guess != numToGuess && end.equalsIgnoreCase("Y")) {
                if (guess > numToGuess) {
                    System.out.println("That is lower than the number.");
                } else if (guess < numToGuess) {
                    System.out.println("That is higher than the number.");
                }
                System.out.println("Do you want to continue guessing?(Y/N)");
                end = scan.nextLine();
                if (end.equalsIgnoreCase("Y")) {
                    numAns++;
                    System.out.println("Guess again: ");
                    numToGuess = scan.nextInt();
                    scan.nextLine();
                }
            }
            if (guess == numToGuess) {
                // print message saying guess is right
                System.out.println("That is right! Congratulations!");
                System.out.println("You answered " + numAns + " times");

            }
            System.out.println("Do you want to play again?(Y/N)");
            again = scan.nextLine();

        } while (again.equalsIgnoreCase("Y"));
        System.out.println("Question two was called and ran sucessfully.");
    }
}

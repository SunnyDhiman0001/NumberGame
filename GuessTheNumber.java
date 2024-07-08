
// Task 1 Completed....

import java.util.*;

public class GuessTheNumber {
    public static void main(String[] args) {
        String playAgain = "yes";
        int totalAttempt = 0;
        int rounds = 0;
        int hideNumber;
        int userPickNumber;
        double AvgAttempts;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to my Game!");

        while (playAgain.equalsIgnoreCase("yes")) {
            hideNumber = random.nextInt(100) + 1;
            int attempt = 0;

            System.out.println("I've picked a number between 1 and 100. Let the Number is "+ hideNumber);
            
            while (attempt<5) {
                System.out.print("Enter your Guess Number: ");
                
                try {
                    userPickNumber = scanner.nextInt();
                    
                } catch (java.util.InputMismatchException e) {
                    System.out.println("Invalid Number. Please Enter valid Number: ");
                    scanner.nextLine();
                    continue;
                }

                attempt++;

                if (userPickNumber<hideNumber) {
                    System.out.println("To low. Please Try again.");
                }
                else if(userPickNumber>hideNumber){
                    System.out.println("To high. Please Try again.");
                }
                else
                {
                    System.out.println("Congratulations! You have guessed the number "+ hideNumber + " in " +attempt+" attempts ");
                    rounds++;
                    totalAttempt+=attempt;
                    break;
                }
            }
            if (attempt == 5) {
                System.out.println("\n Sorry! You have reached All attempt, The correct Number was "
                + hideNumber + ".");
            }
            System.out.println("\n Do you want to play another round? (yes/no): ");
            playAgain = scanner.next();
        }
        if (rounds>0) {
            AvgAttempts = (double) totalAttempt / rounds;
            System.out.println("\n You Won "+ rounds);
        }
        else
        {
            System.out.println("Thank You for Playing Game.");
        }
        scanner.close();
    }
}

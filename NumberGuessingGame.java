import java.util.Scanner;

public class NumberGuessingGame {
    public static void guessingGame() {
        Scanner input = new Scanner(System.in);

        //Generating the number
        int number = 1 + (int) (100 * Math.random());

        int k = 5;
        int i, guess;
        System.out.println("A number is chosen between 1 to 100.\nGuess the number within 5 trails\n");

        for (i = 0; i < k; i++) {
            System.out.print("Guess the mumber: ");
            guess = input.nextInt();

            if (number == guess) {
                System.out.println("Congratulations! You guessed the number");
                break;
            } else if (number > guess && i != k - 1) {
                System.out.println("The number is greater than " + guess);
            } else if (number < guess && i != k - 1) {
                System.out.println("The number is less than " + guess);
            }

        }
        if (i == k) {
            System.out.println("You have exhausted " + k + " trails");
            System.out.println("The number was " + number);
        }
    }
}

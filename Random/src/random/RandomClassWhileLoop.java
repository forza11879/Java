
import java.util.Scanner;

/**
 *
 * @author ipd
 */
public class RandomClassWhileLoop {

    public static void main(String[] args) {

        int secretNumber = 0;
        int guess = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Guess the random number between (1 to 100):");
        

        secretNumber = (int) (Math.random() * 100 + 1);
        System.out.println("Random number from (1 to 100):" + secretNumber);
        //to see the secret number

        do {
            System.out.print("Enter a guess: ");
            guess = input.nextInt();
            //System.out.println("Your guess is " + guess);
            if (guess == secretNumber) {
                System.out.println("Your guess is correct. Congratulations!");
            } else if (guess < secretNumber) {
                System.out.println("Your guess is smaller than the secret number.");
            } else if (guess > secretNumber) {
                System.out.println("Your guess is greater than the secret number.");
            }
        } while (guess != secretNumber);

    }

}


import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {
        int myChoice = 0;

        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Welcome to the IDP");
            System.out.println("------------------");
            System.out.println(" ");
            System.out.println("1. Guess a number");
            System.out.println("2. Try your luck");
            System.out.println("3. Exit");
            System.out.println(" ");

            // myChoice = input.nextInt();
            do {

                System.out.println("Please Enter Your Choise:");
                myChoice = input.nextInt();
            } while (myChoice < 1 || myChoice > 3);

            if (myChoice == 1) {
                System.out.println(" ");
                guess();
                System.out.println(" ");

            } else if (myChoice == 2) {
                System.out.println(" ");
                luck();
                System.out.println(" ");
            }

        } while (myChoice != 3);
    }

    public static void guess() {

        int secretNumber = 0;
        int guess;
        int count = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Guess the random number between (1 to 100):");

        secretNumber = (int) (Math.random() * 100 + 1);
        System.out.println("Random number from (1 to 100):" + secretNumber);
        //to see the secret number

        do {
            System.out.print("Enter a guess: ");
            guess = input.nextInt();
            count = count + 1;
            //System.out.println("Your guess is " + guess);
            if (guess == secretNumber) {
                System.out.println("Your guess is correct. Congratulations!");
            } else if (guess < secretNumber) {
                System.out.println("Your guess is smaller than the secret number.");
            } else if (guess > secretNumber) {
                System.out.println("Your guess is greater than the secret number.");
            } 
    
        } while (guess != secretNumber && count < 8);
        
        System.out.println("wish the user better luck next time");

    }

    public static void luck() {

        int[] myArray;
        myArray = new int[6];

        int max;
        int min;
        int number1, number2;
        int count = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Try your Luck ");

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int) (Math.random() * 50 + 1);
            System.out.print(myArray[i] + " ");
        }

        max = myArray[0];

        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i] > max) {
                max = myArray[i];
            }

        }

        min = myArray[0];

        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i] < min) {
                min = myArray[i];
            }

        }

        System.out.println(" ");
        System.out.println("Max: " + max + "  Mn : " + min + "  Diff :" + (max - min));
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int) (Math.random() * 50 + 1);
            System.out.print(myArray[i] + " ");
        }

        System.out.println(" ");
        System.out.print("Enter the number: ");
        number1 = input.nextInt();

        for (int i = 0; i > myArray.length; i++) {
            if (myArray[i] == number1) {
                count = count + 1;
            } else {
                //System.out.println("The" + number1 + "is found at position" + "position");
                System.out.println("The" + number1 + "is not found in the array");
            }
        }

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == number1) {
                count = count + 1;
            }

        }

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == number1) {
                count = count + 1;
            }

        }

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == number1) {
                count = count + 1;
            }

        }

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == number1) {
                count = count + 1;
            }

        }

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == number1) {
                count = count + 1;
            }

        }

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == number1) {
                count = count + 1;
            }

        }
        //System.out.println("This is a count: " + count);
        switch (count) {
            case 0:
                System.out.println("The " + number1 + " is not found in the array");
                break;
            case 1:
                System.out.println("The " + number1 + "  is found at position" + count);
                break;
            case 2:
                System.out.println("The " + number1 + "  is found at position" + count);
                break;
            case 3:
                System.out.println("The " + number1 + "  is found at position" + count);
                break;
            case 4:
                System.out.println("The " + number1 + "  is found at position" + count);
                break;
            case 5:
                System.out.println("The " + number1 + "  is found at position" + count);
                break;
            case 6:
                System.out.println("The " + number1 + "  is found at position " + count);
                break;

        }
    }

}

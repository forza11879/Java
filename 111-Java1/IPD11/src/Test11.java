
import java.util.Scanner;
// made by: Ion Leahu
public class Test11 {

    public static void main(String[] args) {
        int choice = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the IDP Menu!!!");
        System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _");

        do {
            System.out.println("  1. Guesse a number");
            System.out.print(" ");
            System.out.println(" 2. Try your luck");
            System.out.print(" ");
            System.out.println(" 3. Exit");
            System.out.print(" ");
            System.out.print("Enter your choice:");
            choice = input.nextInt();

            if (choice == 1) {
                System.out.print(" ");
                System.out.println("Welcome to the guessing Gmae");
                System.out.print(" ");
                game1();
            } else if (choice == 2) {
                System.out.print(" ");
                System.out.println("Try Your Luck");
                System.out.print(" ");
                game2();
            }

        } while (choice != 3);

    }

    public static void game1() {
        int number = 0;
        int randomNumber;
        randomNumber = (int) (Math.random() * 100 + 1);

        int count = 0;

        while (count < 6) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a number between 1 and 100:  ");
            number = input.nextInt();

            if (number > randomNumber) {
                System.out.println("Your number is bigger");
                count = count + 1;
                System.out.println("You have " + (5 - count) + " more to go");

            } else if (number < randomNumber) {
                System.out.println("Yor number is smaller");
                count = count + 1;
                System.out.println("You have " + (6 - count) + " more to go");

            } else if (number == randomNumber) {
                System.out.println("You won!!!");
                count = 8;
            }

        }
        if (count == 6) {
            System.out.println("Better luck next time!!!");
            System.out.println("The random number is " + randomNumber);

        }

    }

    public static void game2() {
        int[] array = new int[6];

        int avg = 0;
        int sum = 0;
        int max = array[0];
        int number = 0;
        int j = 0;

        for (int i = 0; i < array.length; i++) {

            array[i] = (int) (Math.random() * 50 + 1);

            System.out.print(array[i] + " ");
            sum = sum + array[i];

            if (max <= array[i]) {
                max = array[i];
            }

        }

        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min >= array[i]) {
                min = array[i];
            }

        }
        Scanner input = new Scanner(System.in);
        System.out.print(" ");
        System.out.println("MAX: " + max + "   MIN: " + min + " Avg: " + (sum / 6));
        System.out.println("Enter a number : ");
        number = input.nextInt();

        for (int i = 0; i < array.length; i++) {
            if (number == array[i]) {

            }
        }
    }
}

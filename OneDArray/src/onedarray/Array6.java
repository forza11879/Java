
import java.util.Scanner;

public class Array6 {

    public static void main(String[] args) {

        int[] myArray;
        myArray = new int[6];

        int number1, number2, number3, number4, number5, number6;

        int count = 0;

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int) (Math.random() * 50 + 1);
            System.out.print(myArray[i] + " ");
        }

        System.out.println(" ");
        System.out.print("Enter First number: ");
        number1 = input.nextInt();

        System.out.print("Enter Second number: ");
        number2 = input.nextInt();

        System.out.print("Enter Second number: ");
        number3 = input.nextInt();

        System.out.print("Enter Second number: ");
        number4 = input.nextInt();

        System.out.print("Enter Second number: ");
        number5 = input.nextInt();

        System.out.print("Enter Second number: ");
        number6 = input.nextInt();

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == number1) {
                count = count + 1;
            }

        }

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == number2) {
                count = count + 1;
            }

        }

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == number3) {
                count = count + 1;
            }

        }

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == number4) {
                count = count + 1;
            }

        }

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == number5) {
                count = count + 1;
            }

        }

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == number6) {
                count = count + 1;
            }

        }

        System.out.println("This is a count: " + count);

        switch (count) {
            case 0:
                System.out.println("You did not win, SORRY");
                break;
            case 1:
                System.out.println("You did not win, SORRY");
                break;
            case 2:
                System.out.println("You won, 10$");
                break;
            case 3:
                System.out.println("You won, 100$");
                break;
            case 4:
                System.out.println("You won, 1000$");
                break;
            case 5:
                System.out.println("You won, 10000$");
                break;
        }

    }
}

import java.util.Scanner;
// made by: Ion Leahu
public class Test21 {

    public static void main(String[] args) {

        int[] myArray;
        myArray = new int[6];

        int max;
        int min;
        int total;
        int number = 0;
        int j = 0;

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int) (Math.random() * 50 + 1);
            System.out.print(myArray[i] + " ");
        }

        total = myArray[0];

        for (int i = 1; i < myArray.length; i++) {

            total = total + myArray[i];
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

        Scanner input = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("Max: " + max + "  Mn : " + min + "  Avg :" + (total / 6));
        System.out.println("Please enter a number in the array: ");
        number = input.nextInt();

        for (int i = 0; i < myArray.length; i++) {
            if (number == myArray[i]) {
                System.out.println("Number: " + number + " is found at the position: " + (i + 1));
                j = j + 1;
            }
        }

        if (j == 0) {
            System.out.println("The " + number + " is not found");
        }

    }

}

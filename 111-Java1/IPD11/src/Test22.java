
import java.util.Scanner;
// made by: Ion Leahu
public class Test22 {

    public static void main(String[] args) {

        int[] myArray;
        myArray = new int[10];

        Scanner input = new Scanner(System.in);

        int max;
        int min;
        int total;
        int nextNumber;

        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Enter a Number: ");
            nextNumber = input.nextInt();
            myArray[i] = nextNumber;
            
        }
        
        for (int i = 0; i < myArray.length; i++) {
           System.out.print(myArray[i] + " ");

       }

        System.out.println("");

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

        System.out.println(" ");
        System.out.println("Total:" + total + " Max:" + max + "  Min :" + min + " Average:" + (total / 10));

    }

}


import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Assignment34 {

    public static void main(String[] args) {
        int sum = 0;
        int i = 0;
        int numbers;
        int[] array = new int[10];
        File myFile = new File("myintegers.txt");

        try {

            Scanner fileInput = new Scanner(myFile);

            // assigning numbers in text document to numbers in array
            while (fileInput.hasNextInt()) {
                numbers = fileInput.nextInt();
                System.out.print("The Number in the .txt file is: " + numbers);
                sum = sum + numbers;
                System.out.println(" ");
                array[i] = numbers;
                i = i + 1;
            }
            int max = array[0];
            int min = array[0];
            System.out.println("Sum is: " + sum);
            System.out.println(" ");

            for (int j = 0; j < array.length; j++) {
                //System.out.print(" " + array[j]);
                if (max <= array[j]) {
                    max = array[j];
                }
            }

            for (int j = 0; j < array.length; j++) {
                //System.out.print(" " + array[j]);
                if (min >= array[j]) {
                    min = array[j];
                }
            }
            System.out.println(" ");
            System.out.println("Max number is: " + max);
            System.out.println("Min number is: " + min);
            System.out.println("Average number is: " + sum / i);
            fileInput.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

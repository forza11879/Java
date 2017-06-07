
package oifilewrite;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FileSaveRead {

    static Scanner input = new Scanner(System.in);

    static int inputInt(String message) {
        for (;;) {
            try {
                System.out.println(message);
                int value = input.nextInt();
                input.nextLine(); // consume left-over new line character
                return value;
            } catch (InputMismatchException ime) {
                input.nextLine(); // consume the invalid input
                System.out.println("Invalid input, try again");
            }
        }
    }

    public static void main(String[] args) throws IOException {

        try {
            System.out.println("Enter your name");
            String name = input.nextLine();

            int age = inputInt("Enter your age");

            System.out.println("Enter your city");
            String city = input.nextLine();

            PrintWriter pw = new PrintWriter(new FileWriter("data.txt"));
            pw.printf("%s is %d years old lives in %s", name, age, city);
            pw.close();

            Scanner fileInput = new Scanner(new File("data.txt"));
            String fileLine = fileInput.nextLine();
            System.out.println("Read line: " + fileLine);
            fileInput.close();
        } catch (InputMismatchException ime) {
            System.out.println("Invalid input. Terminating");
        }
    }

}

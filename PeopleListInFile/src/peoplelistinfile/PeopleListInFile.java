package peoplelistinfile;

import java.util.Scanner;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PeopleListInFile {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("What do you want to do?\n"
                    + "1. Add person info\n"
                    + "2. List persons info\n"
                    + "3. Find a person by name\n"
                    + "4. Find all persons younger than age\n"
                    + "0. Exit\n");

            int choice = input.nextInt();
            if ((choice < 0) || (choice > 4)) {
                System.out.println("Invalid choice");
                continue;
            }
            if (choice == 0) {
                System.out.println("Good bye!");
                return;
            }

            /*System.out.println("Enter two floating point values");
            double v1 = input.nextDouble();
            double v2 = input.nextDouble();

            try {
                System.out.println(message);
                int value = input.nextInt();
                input.nextLine(); // consume left-over new line character
                return value;
            } catch (InputMismatchException ime) {
                input.nextLine(); // consume the invalid input
                System.out.println("Invalid input, try again");
            }
            
            double result = 0;*/
            switch (choice) {
                case 1: {
                    try {
                        addperson();
                    } catch (IOException ex) {

                        input.nextLine(); // consume the invalid input
                        System.out.println("Invalid input, try again");

                    }
                    break;
                }
                /*case 2:
                    result = v1 - v2;
                    break;
                case 3:
                    result = v1 * v2;
                    break;
                case 4:
                    result = v1 / v2;
                    break;*/
                default:
                    System.err.println("Fatal error: invalid control flow");
                    System.exit(1);
            }
            //System.out.printf("Result is: %.4f", result);
        }
    }

    public static void addperson() throws IOException {
        try {
            System.out.println("Enter your name");
            String name = input.nextLine();

            System.out.println("Enter your age");
            int age = input.nextInt();
            input.nextLine(); // consume the invalid input
            //int age = inputInt("Enter your age");

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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filesaveread;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ipd
 */
public class PeopleListInFileJohn {

    /**
     * @param args the command line arguments
     */
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
                case 2:
                   
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
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

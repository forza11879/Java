/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peoplelistinfile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PeopleListInFileTeacher {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("1. Add person info\n"
                + "2. List persons info\n"
                + "3. Find a person by name\n"
                + "4. Find all persons younger than age\n"
                + "0. Exit");
        int choice = inputInt("Choice: ");
        if ((choice < 0) || (choice > 4)) {
            System.out.println("Invalid choice.");
            return;
        }
        switch (choice) {
            case 0:
                System.out.println("Bye bye");
                return;
            case 1:
                addPerson();
                break;
            case 2:
                listPersons();
                break;
            case 3:
                findByName();
                break;
            case 4:
                findByMaxAge();
                break;
            default:
                System.out.println("1-800-WEMESSEDUP");
                System.exit(1);
        }
    }

    static int inputInt(String message) {
        for (;;) {
            try {
                System.out.print(message);
                int value = input.nextInt();
                input.nextLine(); // consume left-over new line character
                return value;
            } catch (InputMismatchException ime) {
                input.nextLine(); // consume the invalid input
                System.out.println("Invalid input, try again");
            }
        }
    }

    private static void addPerson() {
        System.out.println("Adding a person.");
        System.out.print("Enter name: ");
        String name = input.nextLine();
        // TODO: use inputInt(); instead
        int age = inputInt("Enter age: ");
        System.out.print("Enter city: ");
        String city = input.nextLine();
        //
        try {
            PrintWriter pw = new PrintWriter(new FileWriter(FILE_NAME, true));
            pw.printf("%s\n%d\n%s\n", name, age, city);
            pw.close();
            //
            System.out.println("Person added.");
        } catch (IOException ioe) {
            // ioe.printStackTrace();
            System.out.println("Error writing to file. Person not added.");
        }
    }

    private static final String FILE_NAME = "people.txt";

    private static void listPersons() {
        try {
            File file = new File(FILE_NAME);
            if (file.exists()) {
                Scanner fileInput = new Scanner(file);
                while (fileInput.hasNextLine()) {
                    String name = fileInput.nextLine();
                    int age = fileInput.nextInt();
                    fileInput.nextLine();
                    String city = fileInput.nextLine();
                    System.out.printf("%s is %d from %s\n", name, age, city);                    
                }
                fileInput.close();
            } else {
                System.out.println("File does not exist");
            }
        } catch (IOException ex) {
            System.out.println("Error reading file");
        }
    }

    private static void findByName() {
        try {
            File file = new File(FILE_NAME);
            if (file.exists()) {
                Scanner fileInput = new Scanner(file);
                while (fileInput.hasNextLine()) {
                    String name = fileInput.nextLine();
                    int age = fileInput.nextInt();
                    fileInput.nextLine();
                    String city = fileInput.nextLine();
                    System.out.printf("%s is %d from %s\n", name, age, city);                    
                }
                fileInput.close();
            } else {
                System.out.println("File does not exist");
            }
        } catch (IOException ex) {
            System.out.println("Error reading file");
        }
    }

    private static void findByMaxAge() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
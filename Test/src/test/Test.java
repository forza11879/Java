package test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {

            System.out.println("1. Add student and their GPA\n"
                    + "2. List all students and their GPAs\n"
                    + "3. Find all students whose name begins with a letter\n"
                    + "4. Find the average GPA of all students and display it.\n"
                    + "0. Exit");
            int choice = inputIntMenu("Choice: ");
            if ((choice < 0) || (choice > 4)) {
                System.out.println("Invalid choice. Try again.");
                continue;
            }
            switch (choice) {
                case 0:
                    System.out.println("Bye bye");
                    return;
                case 1:
                    addStudent();
                    break;
                case 2:
                    listStudents();
                    break;
                case 3:
                    findByletter();
                    break;
                case 4:
                    avrGpa();
                    break;
                default:
                    System.out.println("1-800-WEMESSEDUP");
                    System.exit(1);
            }
        }
    }

    static int inputIntMenu(String message) {
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

    static double inputDouble(String message) {
        for (;;) {
            try {
                System.out.print(message);
                double value = input.nextDouble();
                input.nextLine(); // consume left-over new line character
                if ((value < 0) || (value > 4.3)) {
                    System.out.println("GPA must be between 0 and 4.3 maximum.");
                } else {
                    return value;
                }

            } catch (InputMismatchException ime) {
                input.nextLine(); // consume the invalid input
                System.out.println("Invalid input");
            }
        }
    }

    private static final String FILE_NAME = "students.txt";

    private static void addStudent() {
        System.out.println("Adding a student.");
        System.out.print("Enter student's name:  ");
        String name = input.nextLine();
        // TODO: use inputInt(); instead
        double gpa = inputDouble("Enter student's GPA: ");
        
        try {
            PrintWriter pw = new PrintWriter(new FileWriter(FILE_NAME, true));
            //pw.printf("%s\n%d\n%s\n", name, gpa, city);
            pw.println(name + gpa );
            pw.close();
            //
            System.out.println("Student added.");
        } catch (IOException ioe) {
            // ioe.printStackTrace();
            System.out.println("Error writing to file. Person not added.");
        }
    }
    
    private static void listStudents() {
        try {
            File file = new File(FILE_NAME);
            if (file.exists()) {
                Scanner fileInput = new Scanner(file);
                while (fileInput.hasNextLine()) {
                    String name = fileInput.nextLine();
                    double gpa = fileInput.nextDouble();
                    
                    fileInput.nextLine();
                    
                    //System.out.printf("%s is %d from %s\n", name, gpa); 
                    System.out.println(name + "has" + gpa);
                }
                fileInput.close();
            } else {
                System.out.println("File does not exist");
            }
        } catch (IOException ex) {
            System.out.println("Error reading file");
        }
    }
    
    
    
    

}

package peoplefromfile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

class Person {

    Person(String n, int a) {

        name = n;
        age = a;

    }

    String name;
    int age;
}

public class PeopleFromFile {

    static ArrayList<Person> people = new ArrayList<>();
    
    private static final String PEOPLETXT = "people.txt";

    public static void main(String[] args) {

        try {
            Scanner read = new Scanner(new FileReader(PEOPLETXT));

            while (read.hasNext()) {
                String name = read.nextLine();
                int age = Integer.parseInt(read.nextLine());
                people.add(new Person(name, age));

            }
            read.close();

        } catch (IOException e) {
            System.err.println("error HAPPENS");
        } catch (InputMismatchException e) {
            System.err.println("Error: file contents mismatch");
        }

        for (Person p : people) {
            System.out.printf("p: name=%s, age=%d\n", p.name, p.age);

        }

    }

}

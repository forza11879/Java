
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

import java.io.*;

public class WriteFile02 {

    public static void main(String[] args) {

        String myName;

        File myFile = new File("mytextfile.txt");
        Scanner input = new Scanner(System.in);

        try {
            PrintWriter myFileOutput = new PrintWriter(myFile);
            
            for (int i = 0; i < 2 ; i++) {
   
                System.out.println("Please Enter a Name: ");
                myName = input.next();
                myFileOutput.println(myName);

            }

            myFileOutput.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}



import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

import java.io.*;

public class Assig32 {

    public static void main(String[] args) {

        int x;

        File myFile = new File("mytextfile.txt");
        Scanner input = new Scanner(System.in);

        try {
            PrintWriter myFileOutput = new PrintWriter(myFile);
            
            for (int i = 0; i < 10 ; i++) {
   
                System.out.println("Please Enter a number: ");
                x = input.nextInt();
                myFileOutput.println(x);

            }

            myFileOutput.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}


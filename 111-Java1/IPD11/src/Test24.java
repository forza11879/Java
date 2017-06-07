import java.util.Scanner;

import java.io.*;
// made by: Ion Leahu
public class Test24 {

    public static void main(String[] args) {

        String myName;

        File myFile = new File("myintegers.txt");
        Scanner input = new Scanner(System.in);

        try {
            PrintWriter myFileOutput = new PrintWriter(myFile);
            
            for (int i = 0; i < 1 ; i++) {
   
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

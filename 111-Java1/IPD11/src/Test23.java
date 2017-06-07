
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

import java.io.*;
// made by: Ion Leahu
public class Test23 {

    public static void main(String[] args) {

        int[][] myArray = new int[6][5];
        File myFile = new File("myintegers.txt");
        
        
        
        try {
            PrintWriter fileoutput = new PrintWriter(myFile);

            for (int row = 0; row < myArray.length; row++) {
                for (int column = 0; column < myArray[row].length; column++) {
                    myArray[row][column] = (int) (Math.random() * 20 + 1);
                    System.out.print(myArray[row][column] + " ");
                    fileoutput.println(myArray[row][column]);

                }

                System.out.println(" ");
                
            }
            fileoutput.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}

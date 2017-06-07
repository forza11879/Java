
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

import java.io.*;

public class WriteFile03 {

    public static void main(String[] args) {

        String myName;

        File myFile = new File("mytextfile.txt");
        

        try {
            Scanner fileInput = new Scanner(myFile);
            
            
            while (fileInput.hasNext()) {
         
                myName = fileInput.next();
                System.out.println(myName);
  
            }

            fileInput.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}


